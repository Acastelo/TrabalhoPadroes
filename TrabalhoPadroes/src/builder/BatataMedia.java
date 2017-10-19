package builder;

public class BatataMedia extends BatataBuilder {

	@Override
	public void buildPreco() {
		item.preco = 3.50;
	}

	@Override
	public void buildNome() {
		item.nome = "Batata Média";
	}
}
