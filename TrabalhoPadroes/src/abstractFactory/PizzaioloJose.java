package abstractFactory;

import java.util.List;

public class PizzaioloJose extends PizzaioloAbstract {

	@Override
	public String getNome() {
		return "Jos�";
	}

	@Override
	public List<Pizza.TipoPizza> sabeFazerPizzaDe() {
		pizzas.add(Pizza.TipoPizza.PRESUNTO);
		return pizzas;
	}
}
