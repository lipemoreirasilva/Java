package fundamentos;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		
		//CONVERSÃO DE CELSIUS PARA FARENHEITS
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius:");
		int c = entrada.nextInt();
		
		double f = c *1.8 + 32;
		
		System.out.printf("%d = %.2f Farenheits.",c,f);
		
		entrada.close();
		
	}

}
