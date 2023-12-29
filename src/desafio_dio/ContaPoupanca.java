package desafio_dio;

public class ContaPoupanca extends Conta {
	//essa classe herda/têm tudo oq a classe conta tem
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta Poupanca: ");
		super.imprimirInfosComuns();
		
	}
	
}
