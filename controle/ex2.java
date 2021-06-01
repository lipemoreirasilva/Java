//2. Criar um programa informa se o ano atual é um ano bissexto

package controle;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o ano: ");
		int ano = entrada.nextInt();
		
		if (ano%4==0) {
			System.out.println("O ano "+ano+" é bissexto!");
		}else {
			System.out.println("O ano "+ano+" NÃO é bissexto!");
		}

		entrada.close();
	}

}
