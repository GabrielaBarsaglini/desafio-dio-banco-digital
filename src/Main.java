public class Main {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
