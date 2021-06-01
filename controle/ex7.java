package controle;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = 1 ;
		int soma = 0;
		
		while ( n > 0) {
			System.out.println("Digite um número: ");
			n = entrada.nextInt();
			if(n==-1) {
				break;
			}
			soma += n;
			System.out.println("Soma dos números: "+soma);
		}

		entrada.close();
	}

}
