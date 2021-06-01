package fundamentos;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		//CALCULO DE IMC
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double alt = entrada.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso/(Math.pow(alt, 2));
		
		System.out.printf("Seu IMC é: %.2f",imc);
		
		entrada.close();
		
		
	}

}
