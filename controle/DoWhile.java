package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String valor = "";
		do {
			System.out.println("Voc� precisa falar as "
					+ "palavras m�gicas");
			System.out.println("Quer sair? ");
			valor = entrada.nextLine();
		}while(!valor.equalsIgnoreCase("Por favor"));

		entrada.close();
		
		
		
	}

}
