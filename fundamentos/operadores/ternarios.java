package fundamentos.operadores;

public class ternarios {

	public static void main(String[] args) {
		double media = 8.6;
		
		
		String resultado = media >= 7.0 ? 
				"aprovado" : "em recupera��o";
		
		System.out.println("O aluno est� "+resultado);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado2 = temDesconto? "Sim." : "N�o.";//�tima alternativa pra converter uma operacao booleana pra "sim" e "n�o"
		
		System.out.println("Tem desconto? "+resultado2);
		
		
		
	}
	
}
