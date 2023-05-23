import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scanner utilizado para que o cliente possa entrar com um dado.
        Scanner scanner = new Scanner(System.in);
        // frase solicitando ao usuário que digite um número.
        System.out.println("Digite sua idade:");
        // este número deve ser do tipo inteiro e vai ser lido e guardado na variável idade.
        int idade = scanner.nextInt();

        // ######### Estrutura de condição #########

        // se idade for menor ou igual a 17
        // então, vou printar "Você é um kid."
        // se idade for maior ou igual a 18 e menor que 65, vou printar "Você é adulto."
        // se não, vou printar "Você é velho pra caralho."
        if (idade <= 17) {
            System.out.println("Você é um kid.");
        }
        else if (idade >= 18 && idade < 65) {
            System.out.println("Você é adulto.");
        }
        else {
            System.out.println("Você é velho pra caralho.");
        }

    }
}