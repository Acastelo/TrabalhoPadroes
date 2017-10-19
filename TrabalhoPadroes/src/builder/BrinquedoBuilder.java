package builder;

import builder.ItemProduct.Tipo;

public abstract class BrinquedoBuilder extends ItemBuilder {

	private enum TipoBrinquedo {
		CARRINHO, BONEQUINHA
	}
		
	@Override
	public void buildTipo() {
		item.tipo = Tipo.BRINQUEDO;
	}
}
