package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		// se os dois trabalhos derem certo -> TV de 50 polegadas
		// se um dos trabalhos derem certo -> TV de 32 polegadas
		// Se eu comprar uma das tvs -> A familia inteira toma sorvete no shopping
		// se nenhum dos dois trabalhos derem certo -> Familia fica em casa
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		//TV de 50 polegadas
		System.out.println(trabalho1 && !trabalho2);
		
		//TV de 32 polegadas
		System.out.println(trabalho1 || trabalho2);
		
		//Tomar sorvete
		System.out.println(trabalho1 && !trabalho2);
		System.out.println(trabalho1 || trabalho2);
		
		//Ficar em casa
		System.out.println(!trabalho1 && trabalho2);
		System.out.println(!trabalho1 || trabalho2);
		System.out.println(trabalho1 && trabalho2);
	
		
	}
}
