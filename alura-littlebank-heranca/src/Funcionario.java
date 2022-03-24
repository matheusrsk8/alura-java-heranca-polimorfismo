
//classe que nao pode ser instanciada, apenas seus filhos concretos // não pode dar um new nesta classe (espaco na memoria)
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo, não implementacao nesta classe, o primeiro filho CONCRETO deve implementar o método
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	

}
