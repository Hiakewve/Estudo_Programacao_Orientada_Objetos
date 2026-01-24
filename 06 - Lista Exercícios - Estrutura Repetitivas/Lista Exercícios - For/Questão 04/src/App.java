import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int N;
        System.out.println("Informe um valor: ");
        N = teclado.nextInt();

        double divisao = 0;
        for(int i = 0; i < N; i++){
            System.out.println("Informe o valor A: ");
            double valorA = teclado.nextDouble();
            System.out.println("Informe o valor B: ");
            double valorB = teclado.nextDouble();

            if(valorB == 0){
                System.out.println("Divisão Impossível!");
            } else {
                divisao = valorA / valorB;
                System.out.println("Resultado da divisão: " + divisao);
            }  
        }

        teclado.close();
    }
}
