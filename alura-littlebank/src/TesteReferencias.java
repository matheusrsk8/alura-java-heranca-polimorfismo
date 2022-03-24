
public class TesteReferencias {
	
	public static void main (String[] args) {
		
		Conta teste1 = new Conta();
		teste1.saldo = 10;
		
		Conta teste2 = teste1;
		
		Conta teste3 = new Conta();
		
		System.out.println("O valor do saldo em teste 1 é: "+ teste1.saldo);
		System.out.println("O valor do saldo em teste 2 é: "+ teste2.saldo+ "\n");
		
		System.out.println("O ID de teste 1 é: "+ teste1);
		System.out.println("O ID de teste 2 é: "+ teste2);
		System.out.println("O ID de teste 3 é: "+ teste3);
		
		if (teste1 == teste2) System.out.println("Estão direcionando para o mesmo objeto (ID)");

	}

}
