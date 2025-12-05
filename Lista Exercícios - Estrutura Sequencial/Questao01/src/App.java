import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = teclado.nextInt();

        if(numero >= 0){
            System.out.println("Positivo!");
        } else {
            System.out.println("Negativo!");
        }

        teclado.close();
    }
}
