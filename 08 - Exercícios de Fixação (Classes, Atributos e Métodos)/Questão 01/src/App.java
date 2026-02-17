import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a largura do Retângulo: ");
        retangulo.largura = teclado.nextDouble();
        System.out.println("Informe a altura do Retângulo: ");
        retangulo.altura = teclado.nextDouble();

        double areaRetangulo = retangulo.area();
        double perimetroRetangulo = retangulo.perimetro();
        double diagonalRetangulo = retangulo.diagonal();

        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Perimetro do RetângulO: " + perimetroRetangulo);
        System.out.println("Diagonal Retangulo: " + diagonalRetangulo);

        teclado.close();
    }
}
