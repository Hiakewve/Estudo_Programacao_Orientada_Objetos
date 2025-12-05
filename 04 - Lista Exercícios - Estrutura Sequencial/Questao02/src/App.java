import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double raioCirculo;
        double areaCirculo;
        double pi = 3.14159;

        System.out.println("Informe o raio do círculo: ");
        raioCirculo = teclado.nextDouble();

        areaCirculo = pi * (raioCirculo * raioCirculo);

        System.out.println("Valor da área do círculo: " + areaCirculo);

        teclado.close();
    }
}
