
public class TestaMetodo {
		
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 900;
		conta.deposite(10);
		conta.saque(410);
		
		Conta conta2 = new Conta();
		conta2.saldo = 30;
		
		if(conta.transfere(500, conta2)) {
			System.out.println("Transferencia concluída");
		}else {
			System.out.println("\n Opa! Seu saldo é insuficiente. Deposite mais dinheiro "
				+ "em nossa conta");
		}
		
		System.out.println("O saldo atual da conta é: "+ conta.saldo);
		System.out.println("O saldo atual da conta2 é: "+ conta2.saldo);
	}
}
