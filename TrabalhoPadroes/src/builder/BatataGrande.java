package builder;

public class BatataGrande extends BatataBuilder {

	@Override
	public void buildPreco() {
		item.preco = 4.00;
	}

	@Override
	public void buildNome() {
		item.nome = "Batata Grande";
	}
}
