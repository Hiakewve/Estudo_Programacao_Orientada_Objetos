import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int coordenadasX;
        int coordenadasY;

        System.out.println("Informe as coordenadas X: ");
        coordenadasX = teclado.nextInt();
        System.out.println("Informe as coordenadas Y: ");
        coordenadasY = teclado.nextInt();

        while(coordenadasX != 0 && coordenadasY != 0){
            if(coordenadasX > 0 && coordenadasY > 0){
                System.out.println("Primeiro");
            } else if(coordenadasX < 0 && coordenadasY > 0){
                System.out.println("Segundo");
            } else if(coordenadasX < 0 && coordenadasY < 0){
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            coordenadasX = teclado.nextInt();
            coordenadasY = teclado.nextInt();
        }
    }
}
