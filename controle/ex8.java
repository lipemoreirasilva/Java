package controle;

import java.util.Scanner;

//Criar um programa que receba uma palavra e 
//imprime no console letra por letra.

public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String valor;
		valor = entrada.next();
		
		for(int i = 0 ; i<valor.length();i++) {
			System.out.println(valor.charAt(i));
		}

		entrada.close();
	}

}
