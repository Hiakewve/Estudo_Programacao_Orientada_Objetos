import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe o valor: ");
        N = teclado.nextInt();

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
