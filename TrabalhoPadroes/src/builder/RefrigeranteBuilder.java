package builder;

import builder.ItemProduct.Tipo;

public abstract class RefrigeranteBuilder extends ItemBuilder{
	
	private enum TipoRefrigerante {
		COCA, GUARANÁ
	}
		
	@Override
	public void buildTipo() {
		item.tipo = Tipo.REFRIGERANTE;
	}
}
