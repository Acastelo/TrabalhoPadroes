package builder;

public class RefrigeranteGuaran� extends RefrigeranteBuilder{

	@Override
	public void buildPreco() {
		item.preco = 3.50;
	}

	@Override
	public void buildNome() {
		item.nome = "Refrigerante Guaran�";
	}
}
