package controle;

import java.util.Scanner;

//1. Criar um programa que receba um número
//e verifique se ele está entre 0 e 10 e é par;

public class ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int v1 = entrada.nextInt();
		
		if(v1 >= 0 && v1 <=10) {
			if(v1%2==0) {
				System.out.println("O número "+v1+" está entre 0 e 10 e é par");
			}else {
				System.out.println("O número "+v1+" está entre 0 e 10 e é ímpar");
			}	
		}else {
			System.out.println("O número "+v1+" não está entre 0 e 10");
		}

		entrada.close();
	}

}
