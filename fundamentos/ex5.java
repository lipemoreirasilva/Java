package fundamentos;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		//Criar um programa que leia o valor da base
		//e da altura de um tri�ngulo e calcule a �rea.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		int b = entrada.nextInt();
		System.out.println("Digite a altura do tri�ngulo: ");
		int a = entrada.nextInt();
		
		int area = b*a/2;
		
		System.out.println("A �rea do tri�ngulo �: " + area);
		entrada.close();
		
		
	}

}
