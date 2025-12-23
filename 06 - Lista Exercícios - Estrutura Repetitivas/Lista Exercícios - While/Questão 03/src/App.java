import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int codigo = 0;
        System.out.println("Tipo de Combustível Abastecido");
        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;

        while(codigo != 4 || codigo > 4){
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            System.out.println("Informe o tipo de combustível abastecido: ");
            codigo = teclado.nextInt();

            if(codigo == 1){
                contadorAlcool++;
            } else if(codigo == 2){
                contadorGasolina++;
            } else if(codigo == 3){
                contadorDiesel++;
            } else if(codigo == 4) {
                System.out.println("Muito Obrigado!");
            }
        }

        System.out.println("Álcool: " + contadorAlcool);
        System.out.println("Gasolina: " + contadorGasolina);
        System.out.println("Diesel: " + contadorDiesel);
    }
}
