package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		//Domingo -> 1
		//Quarta -> 4
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		String dia = entrada.next();
		
		if(dia.equals("segunda")) {
			System.out.println("2");
		}else if(dia.equals("ter�a") || dia.equals("terca")){
			System.out.println("3");
		}else if(dia.equals("quarta")){
			System.out.println("4");
		}else if(dia.equals("quinta")){
			System.out.println("5");
		}else if(dia.equals("sexta")){
			System.out.println("6");
		}else if(dia.equals("s�bado") || dia.equals("sabado")){
			System.out.println("7");
		}else if(dia.equals("domingo")){
			System.out.println("7");
		}else {
			System.out.println("Dia inv�lido");
		}
		
		entrada.close();
		
	}

}
