package classe;

public class PrimeiroTrauma {
	
	int a = 3;// só consigo acessar esse valor se eu criar instância(instancia "p" por exemplo)
	//pois como "main" é static só podemos acessar valores fora dele, criando a
	// instancia, pq o valor de "a" está dentro de PrimeiroTrauma
	
	static int b = 4;//Como tem static na declaração então posso
	//acessar ele diretamente sem precisar criar instâncias
	
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
		System.out.println(b);
	
	}

}
