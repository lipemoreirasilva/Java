package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data(27,05,2000);
		
		Data data2 = new Data();
		data2.ano = 2050;
		
		String dataFormatada1 = data1.obterData();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterData());
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
