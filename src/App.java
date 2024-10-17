public class App {
    public static void main(String[] args) throws Exception {
     Cliente lucas = new Cliente();
     lucas.setNome("Lucas Almeida");

     Conta contaCorrente = new ContaCorrente(lucas);
     Conta contaPoupanca = new ContaCorrente(lucas);

     contaPoupanca.depositar(1000.00);
     contaPoupanca.transferir(20.00, contaCorrente);

     contaCorrente.sacar(10);

     contaCorrente.imprimirExtrato();

     contaPoupanca.imprimirExtrato();
    }
}
