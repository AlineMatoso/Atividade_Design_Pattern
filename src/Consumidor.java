import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;

public class Consumidor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Function<Scanner, AbsCriador>> opcoes = new HashMap<>();
        opcoes.put(1, Consumidor::criarFabricaAuto);
        opcoes.put(2, Consumidor::criarFabricaResidencial);
        opcoes.put(3, Consumidor::criarFabricaVida);
        opcoes.put(4, Consumidor::criarFabricaViagem);
        
        System.out.println("Selecione qual o tipo de seguro deseja selec2ionar: ");

        String[] tiposSeguro = {"Auto", "Residencial", "Vida", "Viagem"};

        for (int i = 0; i < tiposSeguro.length; i++) {
            System.out.println((i + 1) + " - " + tiposSeguro[i]);
        }

        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > 4) {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }
        AbsCriador criador = opcoes.get(escolha).apply(scanner);
        AbsApolice apolice = criador.processarContratacao();

        if (apolice != null) {
            System.out.println(apolice.resumo());
        } else {
            System.out.println("A contratação foi rejeitada.");
         }

         scanner.close();

    }

    private static AbsCriador criarFabricaAuto(Scanner scanner) {

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
    
        return new FabricaAuto(
            segurado,
            dataEmissao,
            valorFipe,
            idadeCondutor,
            tempoHabilitacao,
            coberturaTerceiros
        );
    }

    private static AbsCriador criarFabricaResidencial(Scanner scanner) {

        System.out.println("Qual o valor do imóvel?");
        double valorImovel = scanner.nextDouble();
    
        System.out.println("O imóvel é de alto padrão? (true/false)");
        boolean altoPadrao = scanner.nextBoolean();
    
        System.out.println("Possui escritura ou contrato de locação? (true/false)");
        boolean possuiEscrituraOuContrato = scanner.nextBoolean();
    
        System.out.println("Digite o nome do segurado:");
        scanner.nextLine();
        String segurado = scanner.nextLine();
    
        System.out.println("Digite a data de emissão da apólice:");
        String dataEmissao = scanner.nextLine();
    
        return new FabricaResidencial(
            segurado,
            dataEmissao,
            valorImovel,
            altoPadrao,
            possuiEscrituraOuContrato
        );
    }

    private static AbsCriador criarFabricaVida(Scanner scanner) {

        System.out.println("Qual a idade do segurado?");
        int idade = scanner.nextInt();
    
        System.out.println("Qual o capital segurado?");
        double capitalSegurado = scanner.nextDouble();
    
        System.out.println("O segurado é fumante? (true/false)");
        boolean fumante = scanner.nextBoolean();
    
        System.out.println("Possui certificado médico? (true/false)");
        boolean possuiCertificadoMedico = scanner.nextBoolean();
    
        System.out.println("Digite o nome do segurado:");
        scanner.nextLine();
        String segurado = scanner.nextLine();
    
        System.out.println("Digite a data de emissão da apólice:");
        String dataEmissao = scanner.nextLine();
    
        return new FabricaVida(
            segurado,
            dataEmissao,
            idade,
            capitalSegurado,
            fumante,
            possuiCertificadoMedico
        );
    }

    private static AbsCriador criarFabricaViagem(Scanner scanner) {

        System.out.println("Quantos dias terá a viagem?");
        int diasViagem = scanner.nextInt();
    
        System.out.println("A viagem é internacional? (true/false)");
        boolean internacional = scanner.nextBoolean();
    
        System.out.println("Qual o valor da cobertura de assistência médica?");
        double coberturaAssistencia = scanner.nextDouble();
    
        System.out.println("Possui passaporte? (true/false)");
        boolean possuiPassaporte = scanner.nextBoolean();
    
        System.out.println("Digite o nome do segurado:");
        scanner.nextLine();
        String segurado = scanner.nextLine();
    
        System.out.println("Digite a data de emissão da apólice:");
        String dataEmissao = scanner.nextLine();
    
        return new FabricaViagem(
            segurado,
            dataEmissao,
            diasViagem,
            internacional,
            coberturaAssistencia,
            possuiPassaporte
        );
    }

}