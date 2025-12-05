import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int codigo1;
        int numeroPeças1;
        double valorPeça1;
        int codigo2;
        int numeroPeças2;
        double valorPeça2;
        double valorPagar;

        System.out.println("Informe o código da peça 1: ");
        System.out.println("Informe o número de peças 1: ");
        System.out.println("Informe o valor de cada peça 1: ");
        codigo1 = teclado.nextInt();
        numeroPeças1 = teclado.nextInt();
        valorPeça1 = teclado.nextDouble();
        System.out.println("Informe o código da peça 2: ");
        System.out.println("Informe o número de peças 2: ");
        System.out.println("Informe o valor de cada peça 2: ");
        codigo2 = teclado.nextInt();
        numeroPeças2 = teclado.nextInt();
        valorPeça2 = teclado.nextDouble();

        valorPagar = (numeroPeças1 * valorPeça1) + (numeroPeças2 * valorPeça2);

        System.out.println("Valor a pagar: " + valorPagar);

        teclado.close();
    }
}
