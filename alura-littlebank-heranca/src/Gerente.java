
public class Gerente extends Funcionario {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

	
	public double getBonificacao() {
		System.out.println("Passando pela bonificacao do gerente");
		return super.getSalario();
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	

}
