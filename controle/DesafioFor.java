package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		
		String valor="";
		for(int i =0; i<=5;i++ ) {
			System.out.println(valor);
			valor += "#";
		}
		
		
		//Vers�o do desafio
		//N�o pode usar valor num�rico pra controlar o la�o!
		
		for(String valor2=""; !valor2.equals("######"); valor2 += "#" ) {
			System.out.println(valor2);
		}
		
	}
	
}
