package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaPresunto extends PizzaAbstract {

	private List<Ingrediente> ingredientes;
	private TipoPizza tipoPizza;
	
	public PizzaPresunto() {
		ingredientes = new ArrayList<Ingrediente>();
		tipoPizza = TipoPizza.PRESUNTO;
		adicionarIngredientes();
		pizzas.add(this);
	}
	
	public void adicionarIngredientes() {
		ingredientes.add(Ingrediente.QUEIJO);
		ingredientes.add(Ingrediente.PRESUNTO);
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
