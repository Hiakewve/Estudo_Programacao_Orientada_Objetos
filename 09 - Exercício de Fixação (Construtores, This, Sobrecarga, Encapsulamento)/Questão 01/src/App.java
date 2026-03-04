import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Conta conta;

        System.out.println("Informe o número da conta: ");
        int numeroConta = teclado.nextInt();
        System.out.println("Informe o seu nome: ");
        String nomeConta = teclado.next();
        System.out.println("Você vai fazer um depósito inicial? (s/n)");
        char opcao = teclado.next().charAt(0);
        if(opcao == 's'){
            System.out.println("Informe o valor de depósito: ");
            double valorConta = teclado.nextDouble();
            conta = new Conta(numeroConta, nomeConta, valorConta);
        } else {
            conta = new Conta(numeroConta, nomeConta);
        }

        System.out.println("===== Informações da Conta ====="); 
        System.out.println("Número da Conta: " + conta.getNumeroConta()); 
        System.out.println("Nome: " + conta.getNomeConta()); 
        System.out.println("Valor da Conta: " + conta.getvalorConta());

        System.out.println();
        System.out.println("Informe o valor de depósito: ");
        double valorDeposito = teclado.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println();
        System.out.println("===== Informações da Conta ====="); 
        System.out.println("Número da Conta: " + conta.getNumeroConta()); 
        System.out.println("Nome: " + conta.getNomeConta()); 
        System.out.println("Valor da Conta: " + conta.getvalorConta());

        System.out.println();
        System.out.println("Informe o valor de saque: ");
        double valorSaque = teclado.nextDouble();
        conta.saque(valorSaque);

        System.out.println();
        System.out.println("===== Informações da Conta ====="); 
        System.out.println("Número da Conta: " + conta.getNumeroConta()); 
        System.out.println("Nome: " + conta.getNomeConta()); 
        System.out.println("Valor da Conta: " + conta.getvalorConta());

        teclado.close();
    }
}
