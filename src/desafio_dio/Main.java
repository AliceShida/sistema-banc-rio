package desafio_dio;

public class Main {

	public static void main(String[] args) {
		Cliente alice = new Cliente();
		alice.setNome("Alice");
		
		Conta cc = new ContaCorrente(alice);
		Conta poupanca = new ContaPoupanca(alice);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
