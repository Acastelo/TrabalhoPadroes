package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaCalabresa extends PizzaAbstract {

	private List<Ingrediente> ingredientes;
	private TipoPizza tipoPizza;
	
	public PizzaCalabresa() {
		ingredientes = new ArrayList<Ingrediente>();
		tipoPizza = TipoPizza.CALABRESA;
		adicionarIngredientes();
		pizzas.add(this);
	}
	
	public void adicionarIngredientes() {
		ingredientes.add(Ingrediente.QUEIJO);
		ingredientes.add(Ingrediente.CALABRESA);
		ingredientes.add(Ingrediente.TOMATE);
	}
	
	@Override
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public TipoPizza getTipoPizza() {
		return tipoPizza;
	}

	public void setTipoPizza(TipoPizza tipoPizza) {
		this.tipoPizza = tipoPizza;
	}
}
