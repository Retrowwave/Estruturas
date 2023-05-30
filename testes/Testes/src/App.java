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
    }
}
