public class App {
    public static void main(String[] args) throws Exception {
        
        String [] diasDaSemana = {"Domingo","Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
    
        // Enquanto i for menor que (o número de arrays), incremente + 1 e vá printando na tela o array diasDaSemana.
        for (int i = 0; i < diasDaSemana.length; i++) {
            System.out.println(diasDaSemana[i]);
        }
    
        System.out.println("");
        
        // Enquanto i for menor que (o número de arrays), incremente + 1 e vá printando na tela o array mesesDoAno.
        String [] mesesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < mesesDoAno.length; i++) {
            System.out.println(mesesDoAno[i]);
        }

        System.out.println("");
        
        String [] horasDoDia = {"Uma hora", "Duas horas", "Três horas", "Quatro horas", "Cinco horas", "Seis horas"};

        for (int i = 0; i < horasDoDia.length; i++) {
            System.out.println(horasDoDia[i]);
        }
    }
}
