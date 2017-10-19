package builder;

import builder.ItemProduct.Tipo;

public abstract class BatataBuilder extends ItemBuilder {

	private enum TipoBatata {
		PEQUENA, MÉDIA, GRANDE
	}

	@Override
	public void buildTipo() {
		item.tipo = Tipo.BATATA;
	}
}
