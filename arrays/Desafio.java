package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas: ");
		int n = entrada.nextInt();
		
		double notas[] = new double[n];
		
		for (int i = 0; i < notas.length;i++) {
			System.out.println("Digite a "+(i+1)+" nota");
			notas[i]=entrada.nextDouble();
		}
		
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		double media = soma/notas.length;
		
		System.out.println("Media: "+media);
		

		entrada.close();
	}

}
