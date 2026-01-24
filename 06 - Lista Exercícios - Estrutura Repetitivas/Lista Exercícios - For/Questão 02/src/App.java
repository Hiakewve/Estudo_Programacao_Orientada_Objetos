import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe um valor: ");
        N = teclado.nextInt();

        int X;
        int contadorIn = 0;
        int contadorOut = 0;
        for(int i = 0; i < N; i++){
            System.out.println("Informe o valor número " + i + ": ");
            X = teclado.nextInt();

            if(X >= 10 && X <= 20){
                contadorIn = contadorIn + 1;
            } else {
                contadorOut = contadorOut + 1;
            }
        }

        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");

        teclado.close();
    }
}
