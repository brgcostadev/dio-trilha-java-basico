public class App {
    public static void main(String[] args) throws Exception {
        Cliente bruno =  new Cliente();
        bruno.setNome("Bruno");
        Conta cc = new ContaCorrente(bruno);
        Conta cp = new ContaPoupanca(bruno);

        cc.depositar(100);
        cc.transferir(100, cp);
        cp.sacar(50);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
