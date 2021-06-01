package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class exercicionotas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		Map<String, Double> alunos = new HashMap<>();
		
		System.out.println("Quantos alunos ?");
		int qtdalunos = entrada.nextInt();
		
		String nome_aluno;
		Double nota_aluno;
		
		
		for (int i = 0 ; i < qtdalunos;i++) {
			System.out.println("Nome do aluno ");
			nome_aluno = entrada.next();
			System.out.println("Nota do aluno ");
			nota_aluno = entrada.nextDouble();
			alunos.put(nome_aluno, nota_aluno);
		}
		
		for(Entry<String, Double> aluno: alunos.entrySet()) {
			System.out.print(aluno.getKey() + " -> ");
			System.out.println(aluno.getValue());
		}
		
		

		entrada.close();
		
		
	}

}
