package builder;

import builder.ItemProduct.Tipo;

public abstract class SanduicheBuilder extends ItemBuilder {
	
	private enum TipoSanduiche {
		HAMB�RGUER, CHEESB�RGUER
	}
		
	@Override
	public void buildTipo() {
		item.tipo = Tipo.SANDUICHE;
	}
}
