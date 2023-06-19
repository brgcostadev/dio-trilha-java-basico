import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite o número da conta:");
        conta.numero = scanner.nextInt();

        System.out.println("Digite a Agência:");
        conta.agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        conta.nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");
        conta.saldo = scanner.nextDouble();

        System.out.println(
            "Olá " + conta.nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +
            ", conta " + conta.numero + 
            " e seu saldo " + conta.saldo + " já está disponível para saque!"
        );
        scanner.close();
    }
}