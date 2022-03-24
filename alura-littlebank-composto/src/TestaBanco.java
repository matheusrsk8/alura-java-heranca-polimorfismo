
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("QA");
		
		cliente.setNome("Matheus");
		System.out.println(cliente.getNome());
		
		Conta conta = new Conta();
		
		conta.setTitular(cliente);
		conta.deposite(100);
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getSaldo());
		
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		
		System.out.println(Conta.getTotal());
	}

}
