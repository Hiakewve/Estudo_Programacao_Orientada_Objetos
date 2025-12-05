import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Informe a hora inicial do jogo: ");
        horaInicial = teclado.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        horaFinal = teclado.nextInt();

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " Hora(s)");


        teclado.close();
    }
}
