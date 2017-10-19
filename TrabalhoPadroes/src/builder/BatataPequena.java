package builder;

public class BatataPequena extends BatataBuilder {

	@Override
	public void buildPreco() {
		item.preco = 3.00;
	}
	
	@Override
	public void buildNome() {
		item.nome = "Batata Pequena";
	}
}
