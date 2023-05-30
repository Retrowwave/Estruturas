import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Variável
        double numero = 1920.30f;
        // Classe DecimalFormat, onde o o construtor receberá o formato do valor da variável ("#,##0.00").
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        // Variável numeroFormatado chamando o método format do objeto formato que vai receber como deve ser formatado o número.
        String numeroFormatado = formato.format(numero);
        // Print da variável numeroFormatado com o valor formatado.
        System.out.println(numeroFormatado);

        // int é um tipo de dado primitivo que representa números inteiros de 32 bits
        int inteiro = 10;
        // Integer é uma classe wrapper que envolve o tipo primitivo "int" e fornece funcionalidades adicionais
        Integer inteiro2 = 100;
        // double é um tipo de dado primitivo que representa números de ponto flutuante de 64 bits. usado pra representar números com casas decimais.
        double real = 2.50;
        // Double é uma classe de wrapper (envoltório) para o tipo primitivo "double". Ela fornece métodos e funcionalidades adicionais,
        Double real2 = 2300.90;
        // String é uma sequência de caracteres utilizada para representar texto.
        String caractere = "String";
        // boolean é um tipo de dado lógico que apresentar somente dois valores, verdadeiro ou falso.
        boolean verdadeiro = true;
        boolean falso = false;
        
    }
}
