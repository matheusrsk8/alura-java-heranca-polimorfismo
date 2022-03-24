
public class CriarConta {

	public static void main(String[] args) {
		Conta ccMatheus = new Conta();
		
		ccMatheus.saldo = 1000;
//		System.out.println(ccMatheus.saldo);
		
		ccMatheus.saldo += 10;
		System.out.println("A conta do Math tem: "+ ccMatheus.saldo);
		
		Conta ccGabriella = new Conta();
		ccGabriella.saldo = 500;
		System.out.println("A conta da Gabi tem: "+ ccGabriella.saldo);
		
		if(ccMatheus == ccGabriella) {
			System.out.println("São a mesma conta");
		}else {
			System.out.println("Não são a mesma conta");
			
		}

	}

}
