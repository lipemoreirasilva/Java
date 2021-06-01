package fundamentos;



public class Wrappers {
	public static void main(String[] args) {
		
		
		
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next());//converte a string para inteiro
		Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo=Boolean.parseBoolean("true");//Converte string to boolean
		System.out.println(bo.toString().toUpperCase());//Convertendo boolean para string e deixando maiusculo
		System.out.println((""+ bo).toUpperCase());//colocando (" "+bo), ele transforma em uma string, obs:é meio que uma forma de converter pra string
		
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
	
	}

}
