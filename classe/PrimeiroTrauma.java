package classe;

public class PrimeiroTrauma {
	
	int a = 3;// s� consigo acessar esse valor se eu criar inst�ncia(instancia "p" por exemplo)
	//pois como "main" � static s� podemos acessar valores fora dele, criando a
	// instancia, pq o valor de "a" est� dentro de PrimeiroTrauma
	
	static int b = 4;//Como tem static na declara��o ent�o posso
	//acessar ele diretamente sem precisar criar inst�ncias
	
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
		System.out.println(b);
	
	}

}
