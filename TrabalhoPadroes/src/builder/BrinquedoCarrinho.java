package builder;

public class BrinquedoCarrinho extends BrinquedoBuilder {

	@Override
	public void buildPreco() {
		item.preco = 5.00;
	}
	
	@Override
	public void buildNome() {
		item.nome = "Brinquedo Carrinho";
	}
}
