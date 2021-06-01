package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		//Tudo que est� em italico no codigo s�o atributos de classes
		//basicamente atributos est�ticos(static) que voc� define um valor
		//para ele e ele sempre vai assumir aquele valor, a nao ser
		// que voc� mude
		
		//a grande maioria das vezes que voc� tem algo est�tico
		// VOCE TEM ALGO CONSTANTE
		
		//OBS: Para "travar" a constante em um valor para que n�o
		//possam mexer utilizar "final static..."(ver AreaCirc.java)
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(AreaCirc.area(100));
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
}
