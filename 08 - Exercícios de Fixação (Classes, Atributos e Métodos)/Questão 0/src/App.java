import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Nome do aluno: ");
        estudante.nome = teclado.nextLine();
        System.out.println("Nota 1: ");
        estudante.nota1 = teclado.nextDouble();
        System.out.println("Nota 2: ");
        estudante.nota2 = teclado.nextDouble();
        System.out.println("Nota 3: ");
        estudante.nota3 = teclado.nextDouble();
        
        System.out.println("Nota final do aluno: " + estudante.notaFinal());
        
        if(estudante.notaFinal() < 60){
            System.out.println("Reprovado!");
            System.out.println("Pontos para ser aprovado: " + estudante.situacaoFinal());
        } else {
            System.out.println("Aprovado!");
        }

        teclado.close();
    }
}
