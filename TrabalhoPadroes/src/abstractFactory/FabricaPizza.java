package abstractFactory;

public interface FabricaPizza {
	
	public void criarPizzaCalabreza();
	
	public void criarPizzaPresunto();

	public String informarIngredientesDoDia(String dia);
}
