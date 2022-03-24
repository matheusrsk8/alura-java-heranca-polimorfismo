public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposite(double valor) {
		saldo += valor;
	}
	
	public boolean saque(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
			return false;	
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			conta.deposite(valor);
			return true;
		}
		return false;
	}
}

	