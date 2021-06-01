package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - / * %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double v1 = entrada.nextDouble();
		System.out.println("\nDigite o segundo n�mero: ");
		double v2 = entrada.nextDouble();
		System.out.println("\nDigite a opera��o desejada: ");
		String op = entrada.next();
		
		//LOGICA
		double resultado = "+".equals(op)? v1+v2 : 0;
		 resultado = "-".equals(op)? v1-v2 : resultado;
		 resultado = "*".equals(op)? v1*v2 : resultado;
		 resultado = "/".equals(op)? v1/v2 : resultado;
		 resultado = "%".equals(op)? v1%v2 : resultado;
		 
		
		System.out.printf("%.2f %s %.2f = %.2f ",v1,op,v2,resultado);
		
		entrada.close();
	}

}
