package abstractFactory;

import java.util.List;

public class PizzaioloJoao extends PizzaioloAbstract{
	
	@Override
	public String getNome() {
		return "Jo�o";
	}

	@Override
	public List<Pizza.TipoPizza> sabeFazerPizzaDe() {
		pizzas.add(Pizza.TipoPizza.CALABRESA);
		return pizzas;
	}
}
