import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe o número de casos de teste: ");
        N = teclado.nextInt();

        double mediaPonderada;
        for(int i = 0; i < N; i++){
            System.out.println("Informe o valor A: ");
            double valorA = teclado.nextDouble();
            System.out.println("Informe o valor B: ");
            double valorB = teclado.nextDouble();
            System.out.println("Informe o valor C: ");
            double valorC = teclado.nextDouble();

            mediaPonderada = (valorA * 2 + valorB * 3 + valorC * 5) / 10;

            System.out.println(mediaPonderada);
        }


        teclado.close();
    }
}
