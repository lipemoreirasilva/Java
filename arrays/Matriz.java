package arrays;

import java.util.Arrays;
import java.util.Scanner;



public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdalunos = entrada.nextInt();
		
		System.out.println("Quantos notas por aluno? ");
		int qtdnotas = entrada.nextInt();
		
		double notas[][] = new double[qtdalunos][qtdnotas];
		
		double total = 0;
		for (int a = 0; a < notas.length; a++) {
			for (int n = 0; n < notas[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ",(n+1),(a+1));
				notas[a][n] = entrada.nextDouble();
				total+=notas[a][n];
			}
			
		}
		
		double media = total / (qtdalunos * qtdnotas);
		System.out.println("Média da turma: "+media);
		
		//mostrando em forma de matriz
		for(double[] notasDoAluno:notas) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		

		entrada.close();
	}

}
