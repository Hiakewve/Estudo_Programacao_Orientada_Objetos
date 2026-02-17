public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }

    public void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100; 
    }
}
