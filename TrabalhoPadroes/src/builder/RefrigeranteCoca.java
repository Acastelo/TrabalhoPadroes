package builder;

public class RefrigeranteCoca extends RefrigeranteBuilder{

	@Override
	public void buildPreco() {
		item.preco = 3.50;
	}

	@Override
	public void buildNome() {
		item.nome = "Refrigerante Coca";
	}
}
