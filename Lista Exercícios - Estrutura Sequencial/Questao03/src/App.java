import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Informe um valor: ");
        valorA = teclado.nextInt();
        System.out.println("Informe um valor: ");
        valorB = teclado.nextInt();

        if(valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("São multiplos!");
        } else {
            System.out.println("Não são multíplos!");
        }

        teclado.close();
    }
}
