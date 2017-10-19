package builder;

public class BrinquedoBonequinha extends BrinquedoBuilder {

	@Override
	public void buildPreco() {
		item.preco = 5.00;
	}
	
	@Override
	public void buildNome() {
		item.nome = "Brinquedo Bonequinha";
	}
}
