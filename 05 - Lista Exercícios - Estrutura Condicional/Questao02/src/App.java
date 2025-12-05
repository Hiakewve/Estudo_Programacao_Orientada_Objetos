import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }

        teclado.close();
    }
}
