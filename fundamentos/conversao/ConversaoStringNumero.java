package fundamentos.conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Type first number");
		String valor2 = JOptionPane.showInputDialog(
				"Type second number");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);//converte string to double
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1+num2;
		System.out.println(soma);
		System.out.println("A média é " + soma/2);
		
		
		
		
		
	}
}
