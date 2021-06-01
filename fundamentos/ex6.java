package fundamentos;

import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		//Criar um programa que resolve equações do segundo grau 
		//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a : ");
		int a = entrada.nextInt();
		System.out.println("Digite o valor de b : ");
		int b = entrada.nextInt();
		System.out.println("Digite o valor de c : ");
		int c = entrada.nextInt();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		double baskhara1 = (-b + Math.pow(delta, 0.5))/2*a; 
		double baskhara2 = (-b - Math.pow(delta, 0.5))/2*a; 
		
		
		System.out.println("Delta: "+delta);
		System.out.printf("x1:%.2f | x2:%.2f",baskhara1,baskhara2);

		entrada.close();
		
	}

}
