package fundamentos;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		//Criar um programa que leia um valor e apresente 
		//os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		int v1 = entrada.nextInt();
		
		System.out.println("Valor ao quadrado: " + Math.pow(v1, 2));
		System.out.println("Valor ao cubo: " + Math.pow(v1, 3));
		
		entrada.close();
		
		
		
	}

}
