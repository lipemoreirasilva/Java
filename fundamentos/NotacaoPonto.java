package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
	
		String s = "Good morning Felipe";
		s = s.replace("Felipe", "Peter");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		
		String y = "Felipe".toUpperCase();
		System.out.println(y);
		
		//visto que os metodos abaixo são todos strings e gerarão um resultado
		//de string podemos concatenar quantos métodos quisermos
		String x = "Good morning Felipe".replace("Felipe", "Brenda").toUpperCase().concat("!!");
		System.out.println(x);
		
		
		
		//Tipos primitivos não tem o operador "."
		//Ele é um tipo mais "pobre", o "." tem muito mais coisas
		int a = 3;
		System.out.println(a);
		
		
	}

}
