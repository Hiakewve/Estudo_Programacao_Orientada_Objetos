import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do Dólar: ");
        double precoDolar = teclado.nextDouble();
        System.out.println("Quantos Dólares você quer comprar?");
        double quantia = teclado.nextDouble();
        System.out.println("===== RESULTADO =====");
        System.out.println("Valor do Dólar: " + precoDolar);
        System.out.println("Dólares comprados: " + quantia);
        double resultado = ConversorMoeda.valorSerPago(quantia, precoDolar);
        System.out.println("Valor em reais dos dólares: " + resultado);

        teclado.close();
    }
}
