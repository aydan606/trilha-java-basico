import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#,00");

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        float saldo = 0;

        numeroAgencia = random.nextInt(999) + "-" + random.nextInt(9);
        numeroConta = random.nextInt(999999);
        saldo = Float.parseFloat(df.format(saldo));

        System.out.println("Ola, seja bem vindo ao nosso banco!\n");
        System.out.println("Qual o seu nome?\n");
        nomeCliente = scanner.next();

        System.out.println("\nOla, " + nomeCliente + ", obrigado por escolher a gente!" +
                "Segue abaixo as suas informacoes bancarias: \n");

        System.out.println("Agencia: " + numeroAgencia);
        System.out.println("\n");
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("\n");
        System.out.println("Saldo atual: R$ " + saldo);

    }

}