package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}
		
		if(media < 7 && media > 4.5) {
			System.out.println("Recupera��o");
		}
		
		boolean criterioReprovacao = 
				media <4.5 && media>=0;
		
		if(criterioReprovacao) {
			System.out.println("Reprovado");
		}
		
		
		
		
		entrada.close();
		
	}

}
