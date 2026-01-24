import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe um valor: ");
        N = teclado.nextInt();

        int fatorial = 1;
        for(int i = N; i >= 1; i--){
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);

        teclado.close();
    }
}
