public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estrutura 'while'.");


        // Inicialização; condição; incremento;

        // 1a linha: i é igual a 1.
        // 2a linha: enquanto i for menor que 11, você adiciona 1 número a mais, até chegar a 11.
        // 3a linha: enquanto i for menor que 11, você printa o que adicionou.
        // 4a linha: quando i for igual a 11, você finalizou sua tarefa.

        int i = 1;
        while (i < 11) {
            System.out.println(i++);
        }
    }
}
