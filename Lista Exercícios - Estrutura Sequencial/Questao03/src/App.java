import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        int valorA;
        int valorB;
        int valorC;
        int valorD;
        int diferenca;

        System.out.println("Informe o valor de A: ");
        valorA = teclado.nextInt();
        System.out.println("Informe o valor de B: ");
        valorB = teclado.nextInt();
        System.out.println("Informe o valor de C: ");
        valorC = teclado.nextInt();
        System.out.println("Informe o valor de D: ");
        valorD = teclado.nextInt();

        diferenca = ((valorA * valorB) - (valorC * valorD));

        System.out.println("Diferença: " + diferenca);

        teclado.close();
    }
}
