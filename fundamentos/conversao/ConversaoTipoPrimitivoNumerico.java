package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //convers�o implicita
		System.out.println(a);
		
		float b = (float) 1.1234888888888; //convers�o explicita(CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;//convers�o explicita(CAST)
		System.out.println(d);
		
		
		double e =1.99999;
		int f = (int) e;//convers�o explicita(CAST)
		System.out.println(f);
	}
}
