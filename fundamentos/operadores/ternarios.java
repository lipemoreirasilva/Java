package fundamentos.operadores;

public class ternarios {

	public static void main(String[] args) {
		double media = 8.6;
		
		
		String resultado = media >= 7.0 ? 
				"aprovado" : "em recuperação";
		
		System.out.println("O aluno está "+resultado);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado2 = temDesconto? "Sim." : "Não.";//ótima alternativa pra converter uma operacao booleana pra "sim" e "não"
		
		System.out.println("Tem desconto? "+resultado2);
		
		
		
	}
	
}
