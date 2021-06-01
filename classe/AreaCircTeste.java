package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		//Tudo que está em italico no codigo são atributos de classes
		//basicamente atributos estáticos(static) que você define um valor
		//para ele e ele sempre vai assumir aquele valor, a nao ser
		// que você mude
		
		//a grande maioria das vezes que você tem algo estático
		// VOCE TEM ALGO CONSTANTE
		
		//OBS: Para "travar" a constante em um valor para que não
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
