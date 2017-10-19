package builder;

public class Hamburguer extends SanduicheBuilder {

	@Override
	public void buildPreco() {
		item.preco = 5.00;
	}
	
	@Override
	public void buildNome() {
		item.nome = "Sanduíche Hambúrguer";
	}
}
