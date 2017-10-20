package abstractFactory;

public interface Pizza {
	
	public enum TipoPizza { CALABRESA, PRESUNTO };
	
	public enum Ingrediente { QUEIJO, PRESUNTO, CALABRESA, TOMATE };

	public StringBuffer getIngredientes(TipoPizza tipo); 
}
