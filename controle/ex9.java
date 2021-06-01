package controle;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maior = 0;
		int v1;
		
		for(int i = 0 ; i<10 ; i++) {
			v1 = entrada.nextInt();
			
			if(v1 > maior) {
				maior = v1;
			}
			
		}
		System.out.println(maior);

		entrada.close();
	}

}
