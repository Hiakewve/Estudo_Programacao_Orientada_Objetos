import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double valorX;
        double valorY;
        System.out.println("Informe o valor 1: ");
        valorX = teclado.nextDouble();
        System.out.println("Informe o valor 2: ");
        valorY = teclado.nextDouble();

        if(valorX == 0 && valorY == 0){
            System.out.println("Origem");
        } else if(valorY == 0){
            System.out.println("Eixo X");
        } else if(valorX == 0){
            System.out.println("Eixo Y");
        } else if(valorX > 0 && valorY > 0){
            System.out.println("Quadrante 1");
        } else if(valorX < 0 && valorY > 0){
            System.out.println("Quadrante 2");
        } else if(valorX < 0 && valorY < 0){
            System.out.println("Quadrante 3");
        } else if(valorX > 0 && valorY < 0){
            System.out.println("Quadrante 4");
        }

        teclado.close();
    }
}
