package fundamentos.conversao;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//calcular media dos 3 ultimos salários, se tiver "," trocar por "."
		System.out.println("informe o primeiro salario");
		String salario1 = entrada.nextLine().replace(",",".");
		
		
		System.out.println("informe o segundo salario");
		String salario2 = entrada.nextLine().replace(",",".");
		
		System.out.println("informe o terceiro salario");
		String salario3 = entrada.nextLine().replace(",",".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1+sal2+sal3)/3;
				System.out.printf("A média dos salários é: %.2f",media);
				
		entrada.close();
		
		
	}

}
