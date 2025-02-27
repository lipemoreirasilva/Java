package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribui��o por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " "+ b);
		
		Data d1 = new Data(1,6,2022);
		Data d2 = d1; // Atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano=2025;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		// quando � passado um objeto (Data d) como parametro
		// ele mexe na referencia!
		d.dia=1;
		d.mes=1;
		d.ano=1970;
	}
	
	static void alterarPrimitivo(int c) {
		c++; // Nao gera mudan�as porque � gerado uma copia
		//quando se trata de tipos primitivos
	}

}
