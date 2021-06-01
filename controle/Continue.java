package controle;



public class Continue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
			
			for (i = 1; i <= 10; i++) {
				if(i==5) continue;//o continue interrompe o comando daquela iteração e não imprime o valor
				System.out.println(i);
			}
			
		}
	}

}
