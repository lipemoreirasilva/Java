package classe;



public class Data {
	int dia;
	int mes;
	int ano;
	
	//01-01-1970
	
		Data(){
			//dia = 1;
			//mes = 1;
			//ano = 1970;
			this(1,1,1970);//está chamando o construtor Data debaixo
		
			
		}
	
		Data(int dia,int mes, int ano){
			this.dia = dia; // this: Chama o parametro "dia" da instância lá em cima
			this.mes = mes;
			this.ano = ano;
		}

	
	
	//O MAIS INTERESSANTE É UTILIZAR ESSE PRIMEIRO MÉTODO
	//POIS OS OUTROS SÓ FUNCIONAM EM TERMINAIS
	String obterData(){
		final String formato = "Data escolhida: %d/%d/%d";
		return String.format(formato,dia,mes,ano);
	}
	
	void imprimirDataFormatada(){
		System.out.println(obterData());
	}
	

	
	
	
}
