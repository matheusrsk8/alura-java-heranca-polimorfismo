public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta() {
		Conta.total++;
	}
	
	public void deposite(double valor) {
		this.saldo += valor;
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
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
}

	