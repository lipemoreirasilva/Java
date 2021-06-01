package fundamentos;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		//Criar um programa que leia o valor da base
		//e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo: ");
		int b = entrada.nextInt();
		System.out.println("Digite a altura do triângulo: ");
		int a = entrada.nextInt();
		
		int area = b*a/2;
		
		System.out.println("A área do triângulo é: " + area);
		entrada.close();
		
		
	}

}
