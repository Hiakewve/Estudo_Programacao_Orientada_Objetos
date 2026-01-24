import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe um valor: ");
        N = teclado.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.println(i + " " + i * i + " " + i * i * i);
        }

        teclado.close();
    }
}
