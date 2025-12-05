import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double salario;
        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();
        double valorPagar = 0;

        if(salario >= 0 && salario <= 2000){
            valorPagar = 0;
        } else if(salario > 2000 && salario <= 3000){
            valorPagar = (salario - 2000) * 0.08;
        } else if(salario > 3000 && salario <= 4500){
            valorPagar = (salario - 3000) * 0.18 + (1000 * 0.08);
        } else {
            valorPagar = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        } 

        System.out.println("Valor pagar: " + valorPagar);

        teclado.close();
    }
}
