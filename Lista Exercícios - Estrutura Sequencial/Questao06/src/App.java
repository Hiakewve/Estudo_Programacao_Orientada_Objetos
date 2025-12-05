import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double valorA;
        double valorB;
        double valorC;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;
        double pi = 3.14159;

        System.out.println("Informe o valor de A: ");
        System.out.println("Informe o valor de B: ");
        System.out.println("Informe o valor de C: ");
        valorA = teclado.nextDouble();
        valorB = teclado.nextDouble();
        valorC = teclado.nextDouble();

        areaTriangulo = (valorA * valorC) / 2;
        areaCirculo = pi * valorC * valorC;
        areaTrapezio = ((valorA + valorB) * valorC) / 2;
        areaQuadrado = valorB * valorB;
        areaRetangulo = valorA * valorB;

        System.out.println("Triângulo: " + areaTriangulo);
        System.out.println("Circulo: " + areaCirculo);
        System.out.println("Trapézio: " + areaTrapezio);
        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retângulo: " + areaRetangulo);

        teclado.close();
    }
}
