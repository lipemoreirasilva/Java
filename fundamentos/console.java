package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia");
	
		
		System.out.println("\nBom");
		System.out.println("dia");
		
		System.out.printf("Mega sena: %d %d %d\n ",1,2,3);
		System.out.printf("Sal�rio: %.1f\n",1234.1231);
		
		System.out.printf("Nome:%s%n","Jo�o");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("%s %s, tem %d anos.\n",nome,sobrenome,idade);
		
		entrada.close();
		
	
	}
}
