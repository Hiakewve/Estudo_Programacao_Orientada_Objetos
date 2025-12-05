import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numeroFuncionario;
        int horasTrabalhadas;
        double valorHora;
        double salarioFuncionario;

        System.out.println("Informe o número do funcionário: ");
        numeroFuncionario = teclado.nextInt();
        System.out.println("Informe o número de horas trabalhadas pelo funcionário: ");
        horasTrabalhadas = teclado.nextInt();
        System.out.println("Infomre o valor da hora de trabalho do funcionário: ");
        valorHora = teclado.nextDouble();

        salarioFuncionario = valorHora * horasTrabalhadas;

        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.println("Salário do funcionário: " + salarioFuncionario);
        
        teclado.close();
    }
}
