
public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0001, 1234);
		ContaPoupanca cp = new ContaPoupanca(0001, 4321);
		
		cc.deposita(100);
		cc.transfere(20, cp);
		
		System.out.println("O saldo da CC: "+ cc.getSaldo());
		System.out.println("O saldo da CP: "+ cp.getSaldo());

	}

}
