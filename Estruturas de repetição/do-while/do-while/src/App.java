public class App {
    public static void main(String[] args) throws Exception {

    // do-while: A estrutura de repetição "do-while" é semelhante à estrutura "while", 
    // mas a condição é verificada após a execução do bloco de código, o que garante que o bloco de código seja executado pelo menos uma vez. 

        // i recebe 1
        int i = 1;

        // faça: incremento de i
        do {
            System.out.println(i++);
        // enquanto i for menor ou igual a 10
        } while (i <= 10);
    }
}