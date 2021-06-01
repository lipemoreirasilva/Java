//Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
//Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o 
//número inserido é maior ou menor do que o número armazenado.

package controle;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x = 45;
		
		
		for (int c = 10 ; c>0;c--) {
			System.out.println("Tentativas restantes: "+c);
			System.out.println("Informe o número: ");
			int num = entrada.nextInt();
			if(num > x) {
				System.out.println("O número "+num+" é maior do que o armazenado");
			}else if(num < x){
				System.out.println("O número "+num+" é menor do que o armazenado");
			}else {
				System.out.println("O número "+num+" é igual ao armazenado");
			}
			
		}

		entrada.close();
	}

}
