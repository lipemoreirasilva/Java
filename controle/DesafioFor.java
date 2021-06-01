package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		
		String valor="";
		for(int i =0; i<=5;i++ ) {
			System.out.println(valor);
			valor += "#";
		}
		
		
		//Versão do desafio
		//Não pode usar valor numérico pra controlar o laço!
		
		for(String valor2=""; !valor2.equals("######"); valor2 += "#" ) {
			System.out.println(valor2);
		}
		
	}
	
}
