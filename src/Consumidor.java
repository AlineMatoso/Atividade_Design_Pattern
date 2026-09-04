import java.util.Scanner;

public class Consumidor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione qual o tipo de seguro deseja selecionar: ");

        // criamos um vetor de array de string para mostrar os tipos de seguro na tela 

        String[] tiposSeguro = {"Auto", "Residencial", "Vida", "Viagem"};

        for (int i = 0; i < tiposSeguro.length; i++) {
            System.out.println((i + 1) + " - " + tiposSeguro[i]);
        }

        int escolha = scanner.nextInt();

        if (escolha == 1){
            System.out.println("Qual o valor da tabela FIPE do carro?");
            double valorFipe = scanner.nextDouble();
        }

        

        



    }

    
}
