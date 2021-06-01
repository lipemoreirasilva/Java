package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2"=="2");
		
		String s1 = new String("2");
		System.out.println("2"==s1);
		System.out.println("2".equals(s1));// o ".equals" compara o conteudo

		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());//".trim" tira os espaço em branco
		System.out.println("2".equals(s2.trim()) );//".trim" tira os espaço em branco
		
		String s3 = entrada.nextLine();// O "next" tira os espaços em branco automaticamente e o "nextLine" não
		System.out.println(s3.trim());
		
		
		//MORAL DA AULA: SEMPRE QUE FOR COMPARAR STRING USE O EQUALS
		entrada.close();
	
	
	}

}
