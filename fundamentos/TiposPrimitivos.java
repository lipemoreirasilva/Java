package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados= 3_134_845_223L;
		
		//tipos numericos reais
		float salario = 11_445.44F; /*
		 							Ao colocar um valor literal, ele atribui ao tipo Double
		 							para converter para para Float, colocar o "F" no final.
		 							*/
		double vendasAcumuladas=2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status ='A'; //Permite uma única letra
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
