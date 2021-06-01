package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco=12.56;
		
		
		Produto.desconto=0.5;
		
		System.out.println(p1.nome + ":" +p1.precoComDesconto());
		System.out.println(p2.nome + ":" +p2.precoComDesconto());
		
		double preco_final1 = p1.precoComDesconto();
		double preco_final2 = p2.precoComDesconto(0.1);
		double media_carrinho = (preco_final1+ preco_final2)/2;
		
		System.out.printf("Media do carrinho: R$%.2f",media_carrinho);
		
	
	}

}
