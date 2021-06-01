package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double a = Math.pow((3+2)*6,2)/(3*2);
		double b = Math.pow((1-5)*(2-7)/2,2);
		double c = Math.pow(a-b, 3);
		double d = c/(Math.pow(10, 3));
		
		System.out.printf("a:%.2f ",a);
		System.out.printf("\nb:%.2f ",b);
		System.out.printf("\nc:%.2f ",c);
		System.out.println("\nO resultado é " + d);
		
	}

}
