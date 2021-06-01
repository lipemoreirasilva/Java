package fundamentos;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double f = entrada.nextDouble();
		
		double c = (f - 32) / 1.8;
		
		System.out.printf("%.2f = %.2f Farenheits.",f,c);
		
		entrada.close();
	}

}
