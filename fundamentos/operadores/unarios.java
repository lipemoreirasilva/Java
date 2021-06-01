package fundamentos.operadores;

public class unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//FORMA POS FIXADA
		a++;// a = a + 1
		a--;// a = a - 1
		
		//FORMA PRE FIXADA
		++b;// b = b + 1
		--b;// b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);// por se tratar de forma pos fixada ele, primeiro faz a comparação e depois que decrementa. Por isso deu "true"
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
