public class App {
    public static void main(String[] args) {
        ContaCorrente contaBruno = new ContaCorrente();
        contaBruno.agencia = 123;
        contaBruno.numeroConta = 987654;
        contaBruno.saldo = 1500.00;

        System.out.println("Agencia: " + contaBruno.agencia);
        System.out.println("Conta: " + contaBruno.numeroConta);
        System.out.println("Saldo : " + contaBruno.saldo);
        
    }
}
