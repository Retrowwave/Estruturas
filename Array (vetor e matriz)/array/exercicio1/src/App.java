import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

// 1) Faça um programa que lê 5 números inteiros do teclado e armazene em um vetor. Ao final
// imprima o vetor armazenado nos dois sentidos.

        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tamanhoVetor; i++) {

            System.out.println("Digite um número inteiro: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Vetor no sentido original:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Vetor no sentido contrário:");
        for (int i = tamanhoVetor -1; i >= 0; i--) {
            System.out.println(vetor[i] + "");
        }
    }
}
