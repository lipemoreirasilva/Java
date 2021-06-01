package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // a palavra final faz com que pi não possa ser alterada
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 5;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m2.");
	
		
	}

}
