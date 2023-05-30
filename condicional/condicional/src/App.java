import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Estrutura condicional

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos kg você tem?");
        int gordo = scanner.nextInt();

        scanner.close();
        
        if (gordo >= 70) {
            System.out.println("Você ta gordo.");
        }
        else if (gordo < 50) {
            System.out.println("Você ta um palito.");
        }
        else {
            System.out.println("Você está no peso ideal.");
        }
    }
}