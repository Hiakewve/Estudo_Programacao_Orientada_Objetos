import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double numeroLido;
        System.out.println("Informe um número: ");
        numeroLido = teclado.nextDouble();

        if(numeroLido >= 0 && numeroLido <= 25){
            System.out.println("Intervalo (0, 25)");
        } else if(numeroLido > 25 && numeroLido <= 50){
            System.out.println("Intervalo (25, 50)");
        } else if(numeroLido > 50 && numeroLido <= 75){
            System.out.println("Intervalo (50, 75)");
        } else if(numeroLido > 75 && numeroLido <= 100){
            System.out.println("Intervalo (75, 100)");
        } else {
            System.out.println("Fora do intervalo");
        }

        teclado.close();
    }
}
