/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int senha = 2002;
        int senhaInformada = 0;
        
        while(senhaInformada != senha){
            
            System.out.println("Informe a senha de acesso: ");
            senhaInformada = teclado.nextInt();
            
            if(senhaInformada != senha){
                System.out.println("Senha Inválida");
            } else {
                System.out.println("Acesso Permitido!");
            }
            
        }

        
    }
}
