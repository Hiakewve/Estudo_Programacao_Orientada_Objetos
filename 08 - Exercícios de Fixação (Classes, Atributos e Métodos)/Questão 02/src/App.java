import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = teclado.nextLine();
        System.out.println("Salário Bruto: ");
        funcionario.salarioBruto = teclado.nextDouble();
        System.out.println("Imposto: ");
        funcionario.imposto = teclado.nextDouble();

        System.out.println("===== Dados do Funcionário =====");
        System.out.println("Nome do funcionário: " + funcionario.nome);
        System.out.println("Salário Líquido: " + funcionario.salarioLiquido());

        System.out.println("Qual a porcentagem de aumento do salário do funcionário? ");
        double porcentagem = teclado.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println("===== Dados do Funcionário =====");
        System.out.println("Nome do funcionário: " + funcionario.nome);
        System.out.println("Salário Líquido: " + funcionario.salarioLiquido());

        teclado.close();
    }
}
