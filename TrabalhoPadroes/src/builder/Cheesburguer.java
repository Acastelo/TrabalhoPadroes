package builder;

public class Cheesburguer extends SanduicheBuilder {

	@Override
	public void buildPreco() {
		item.preco = 6.00;
	}
	
	@Override
	public void buildNome() {
		item.nome = "Sanduíche Cheesbúrguer";
	}
}