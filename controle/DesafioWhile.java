package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		double nota;
		int c = 0;
		int total = 0;
		
		do {
			System.out.println("Digite a nota: ");
			nota = entrada.nextDouble();
			if(nota>=0 && nota<=10) {
				c++;
				total += nota;
			}else {
				System.out.println("Por favor digite uma nota v�lida: ");
			}
		}
		while(nota != -1);
			
			
		double media = total/c;
		
		System.out.println("Total de notas v�lidas: "+c);
		System.out.println("M�dia:"+media);
		
		entrada.close();
	}

}
