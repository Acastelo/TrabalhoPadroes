package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaAbstract implements Pizza {

	public List<PizzaAbstract> pizzas;

	public PizzaAbstract() {
		pizzas = new ArrayList<PizzaAbstract>();
	}

	@Override
	public StringBuffer getIngredientes(TipoPizza tipo) {
		StringBuffer buffer = new StringBuffer();
		for (PizzaAbstract pizza : pizzas) {
			for (Ingrediente ingrediente : pizza.getIngredientes()) {
				buffer.append("\t" + ingrediente + "\n");
			}
		}
		return buffer;
	}

	public abstract List<Ingrediente> getIngredientes();
}
