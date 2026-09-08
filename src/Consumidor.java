import java.util.Scanner;

public class Consumidor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione qual o tipo de seguro deseja selecionar: ");

        String[] tiposSeguro = {"Auto", "Residencial", "Vida", "Viagem"};

        for (int i = 0; i < tiposSeguro.length; i++) {
            System.out.println((i + 1) + " - " + tiposSeguro[i]);
        }

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Qual o valor da tabela FIPE do carro?");
            double valorFipe = scanner.nextDouble();
        
            System.out.println("Qual a idade do condutor?");
            int idadeCondutor = scanner.nextInt();
        
            System.out.println("Há quanto tempo o condutor possui habilitação?");
            int tempoHabilitacao = scanner.nextInt();
        
            System.out.println("Qual o valor da cobertura para terceiros?");
            double coberturaTerceiros = scanner.nextDouble();
        
            System.out.println("Digite o nome do segurado:");
            scanner.nextLine();
            String segurado = scanner.nextLine();
        
            System.out.println("Digite a data de emissão da apólice:");
            String dataEmissao = scanner.nextLine();
        
            
        
            FabricaAuto fabrica = new FabricaAuto(
                    segurado,
                    dataEmissao,
                    valorFipe,
                    idadeCondutor,
                    tempoHabilitacao,
                    coberturaTerceiros
            );
        
            AbsApolice apolice = fabrica.processarContratacao();
            if (apolice != null) {
                System.out.println(apolice.resumo());
            } else {
                System.out.println("A contratação foi rejeitada.");
            }

        }
    }
}