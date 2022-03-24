
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario matheus = new Gerente();
		
		matheus.setCpf("41008489392");
		matheus.setNome("Matheus Rocha");
		matheus.setSalario(3300.0);
		
		System.out.println(matheus.getBonificacao());
		
//		matheus.salario = 5000;

	}

}
