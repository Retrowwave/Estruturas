import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    // Estrutura de controle switch

    Scanner scanner = new Scanner(System.in);

    int valor;

do { // repita o programa enquanto valor for diferente ou igual a 0. 
    System.out.println("Selecione uma opção:");
    System.out.println("---------------------------");
    System.out.println("| 0 - Parar o programa.   |");
    System.out.println("| 1 - Executar o programa.|");
    System.out.println("| 2 - Status do programa. |");
    System.out.println("---------------------------");

    valor = scanner.nextInt();

    switch (valor) {
        case 1:
        System.out.println("Você digitou a opção: " + valor + " Executar o programa.");
        System.out.println("---------------------------");
        System.out.println("");
            break;

        case 2:
        System.out.println("Você digitou a opção: " + valor + " Status do programa.");
        System.out.println("---------------------------");
        System.out.println("");
            break;

        case 0:
        System.out.println("Você digitou a opção: " + valor + " Saindo do programa...");
        System.out.println("---------------------------");
        System.out.println("");
            break;

        default:
        System.out.println(valor + ": Opção inválida!" + " Insira um valor válido seu viado. Tem que ser entre 0 e 2:");
        System.out.println("");
            valor = -1;
            break;
            }
        } while (valor != 0); // repita o programa enquanto valor for diferente ou igual a 0.
    }
}