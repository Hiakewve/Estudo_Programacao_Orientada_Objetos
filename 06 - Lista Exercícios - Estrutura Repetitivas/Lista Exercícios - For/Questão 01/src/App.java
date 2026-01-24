import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int X;
        System.out.println("Informe um valor: ");
        X = teclado.nextInt();

        for(int i = 0; i <= X; i++){
            if(i % 2 != 0){
                System.out.println("Valor Ímpar: " + i);
            }
        }

        teclado.close();
    }
}
