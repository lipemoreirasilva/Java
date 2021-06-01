package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz",0.8);
		Comida c2 = new Comida("Feijão",0.4);
			
		Pessoa p = new Pessoa("Felipe",58.5);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		
	}

}
