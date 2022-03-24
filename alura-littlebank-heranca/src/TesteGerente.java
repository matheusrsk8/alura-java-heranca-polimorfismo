
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setCpf("41008489392");
		g1.setNome("g1 Rocha");
		g1.setSalario(5000.0);
		
		g1.setSenha(1234);
		
		System.out.println(g1.getNome());
		System.out.println(g1.autentica(1234));
		System.out.println(g1.getBonificacao());
	}

}
