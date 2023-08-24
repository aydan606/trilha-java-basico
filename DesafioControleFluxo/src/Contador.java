import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[]args){

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        // Parametro para incremento do loop da iteracao
        int aux = 1;

        try {

            System.out.println("Insira os parametros abaixo:");
            // Parametros inseridos pelo usuario:
            int param1 = terminal.nextInt();
            int param2 = terminal.nextInt();
            verificarParametros(param1, param2);

            for(int i = param1; i <= (param2 - 1); i++) {
                System.out.println(aux + "ª iteracao do loop.");
                aux++;
            }

        }

        catch (ParametroInvalidoException e) {
            System.out.println("O primeiro numero precisa ser menor que o segundo! Tente novamente.");
        }

    }

    static void verificarParametros(int param1, int param2) throws ParametroInvalidoException {

        if (param1 > param2)
            throw new ParametroInvalidoException();
    }

}

