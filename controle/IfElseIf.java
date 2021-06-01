package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double n1 = entrada.nextDouble();
		
		if (n1 > 10 || n1 < 0) {
			System.out.println("Nota inválida");
		}else if(n1 > 8.0) {
			System.out.println("Conceito A");
		}else if(n1 > 6) {
				System.out.println("Conceito B");
		}else if(n1 > 4) {
			System.out.println("Conceito C");
		}else if(n1 > 2) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}
		
		
		entrada.close();
		
	}

}
