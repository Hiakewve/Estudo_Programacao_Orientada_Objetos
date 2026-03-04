public class Conta {
    private int numeroConta;
    private String nomeConta;
    private double valorConta;

    public Conta(int numeroConta, String nomeConta, double depositoInicial){
    this.numeroConta = numeroConta;
    this.nomeConta = nomeConta;
    deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nomeConta){
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeConta(){
        return nomeConta;
    }

    public void setNomeConta(String nomeConta){
        this.nomeConta = nomeConta;
    }

    public double getvalorConta(){
        return valorConta;
    }

    public void deposito(double valorDeposito){
        if(valorDeposito > 0){
            valorConta = valorConta + valorDeposito;
        } else {
            System.out.println("Não é permitido o depósito de um valor negativo.");
        }
    }

    public void saque(double valorSaque){
        if(valorSaque > 0){
            valorConta = valorConta - valorSaque - 5; 
        } else {
            System.out.println("Não é permitido o saque de um valor negativo.");
        }
    }
}


