import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*  Liste apenas os números primos de 1 a 100:
    requisitos:
    2 laços de repetição
    1 condicional
    3 variáveis */

    //Scanner scanner = new Scanner(System.in);
    //scanner.close();

    // PRIMEIRO LAÇO DE REPETIÇÃO
    //for (int i = 0; i <= 10; i++) {
    //    System.out.println(i);
    //    }

    // SEGUNDO LAÇO DE REPETIÇÃO
    //int i = 1;
    //do {
    //        System.out.println(i++);
    //    } while (i <= 10);
    //}

    // 1 ESTRTURUA CONDICIONAL

    //int i = 1;
    //if (i == 0) {
    //    System.out.println("true");
    //}
    //else {
    //    System.out.println("false");
    //}

    System.out.println("Números primos de 1 a 100");

    // numero recebe 1. enquanto número for menor ou até chegar a 100, vou incrementar um número a mais.
    // a variável ehPrimo recebe true até chegar a 100.
    for (int numero = 2; numero <= 100; numero++) {
        boolean ehPrimo = true;

        // Verifica se o número é divisível por algum outro número além de 1 e ele mesmo

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
                }
            }
        }
    }
}