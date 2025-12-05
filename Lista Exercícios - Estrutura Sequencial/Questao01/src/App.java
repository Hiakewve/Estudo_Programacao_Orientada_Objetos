import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        
        System.out.println("Número 1:");
        numero1 = teclado.nextInt();
        System.out.println("Número 2: ");
        numero2 = teclado.nextInt();
        soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        teclado.close();
    }
}
