import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int codigoProduto;
        int quantidade;
        double valorPagar = 0;

        System.out.println("Informe o Código do Produto: ");
        codigoProduto = teclado.nextInt();
        System.out.println("Informe a quantidade: ");
        quantidade = teclado.nextInt();

        if(codigoProduto == 1){
            valorPagar = quantidade * 4.00;
        } else if(codigoProduto == 2){
            valorPagar = quantidade * 4.50;
        } else if(codigoProduto == 3){
            valorPagar = quantidade * 5.00;
        } else if(codigoProduto == 4){
            valorPagar = quantidade * 2.00;
        } else if(codigoProduto == 5){
            valorPagar = quantidade * 1.50;
        } else {
            System.out.println("O código não está disponível!");
        }

        System.out.println("Total: " + valorPagar);

        teclado.close();
    }
}
