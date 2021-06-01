package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Hi guys!".charAt(0));
		
		String s = "Boa tarde"; // A String é IMUTAVEL, não podemos modificar o valor armazenado na variavel "s"
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Bom"));//Verifica se a string começa com aquela parte e retorna verdadeiro ou falso
		System.out.println(s.startsWith("Boa"));//Verifica se a string começa com aquela parte e retorna verdadeiro ou falso
		System.out.println(s.toLowerCase().startsWith("boa"));//transformo a string em letras minusculas e depois verifico se começa com letras minusculas
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 32;
		var salario = 1234.54;
		
		System.out.println("Nome:" + nome + "\nSobrenome:" + sobrenome);
		
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f reais.", 
					nome, sobrenome,idade, salario);//coloca as variaveis nos "%"
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f reais.", 
					nome, sobrenome,idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		System.out.println("".isEmpty());//Só retorna true se o length da stream for 0
		System.out.println("  ".isBlank());//retorna true se tiver apenas espaços em brancos, e nao importa o length da string
		System.out.println("Frase qualquer".lastIndexOf("qualquer"));
		System.out.println("Frase qualquer\n".repeat(3));
		
		
		
	}

}
