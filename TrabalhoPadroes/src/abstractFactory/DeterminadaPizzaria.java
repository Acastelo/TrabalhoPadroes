package abstractFactory;

import java.util.ArrayList;
import java.util.List;

import abstractFactory.Pizza.TipoPizza;

public class DeterminadaPizzaria extends PizzariaAbstract implements FabricaPizza {

	private static DeterminadaPizzaria instancia;

	protected DeterminadaPizzaria() {
		super();
		contratarPizzaiolos();
	}

	public static DeterminadaPizzaria getInstancia() {
		if (instancia == null) {
			instancia = new DeterminadaPizzaria();
		}
		return instancia;
	}

	@Override
	public void criarPizzaCalabreza() {
		new PizzaCalabresa();
	}

	@Override
	public void criarPizzaPresunto() {
		new PizzaPresunto();
	}

	@Override
	public List<FabricaPizzaiolo> contratarPizzaiolos() {
		FabricaPizzaiolo pizzaioloJoao = new PizzaioloJoao();
		pizzaiolos.add(pizzaioloJoao);
		alocarPizzaiolo(pizzaioloJoao);

		FabricaPizzaiolo pizzaioloJose = new PizzaioloJose();
		pizzaiolos.add(pizzaioloJose);
		alocarPizzaiolo(pizzaioloJose);

		return pizzaiolos;
	}

	public void alocarPizzaiolo(FabricaPizzaiolo pizzaiolo) {
		List<Dias> diasTrabalho;
		switch (pizzaiolo.getNome()) {
		case "João":
			diasTrabalho = new ArrayList<Dias>();
			diasTrabalho.add(Dias.SEGUNDA);
			diasTrabalho.add(Dias.QUARTA);
			diasTrabalho.add(Dias.SEXTA);
			pizzaiolo.setDiasTrabalho(diasTrabalho);
			break;
		case "José":
			diasTrabalho = new ArrayList<Dias>();
			diasTrabalho.add(Dias.TERÇA);
			diasTrabalho.add(Dias.QUINTA);
			diasTrabalho.add(Dias.SABADO);
			pizzaiolo.setDiasTrabalho(diasTrabalho);
			break;
		default:
			break;
		}
	}

	@Override
	public List<FabricaPizzaiolo> getPizzaiolos() {
		return pizzaiolos;
	}

	public FabricaPizzaiolo getPizzaioloDoDia(Dias dia) {
		FabricaPizzaiolo pizzaioloDoDia = null;
		for (FabricaPizzaiolo pizzaiolo : pizzaiolos) {
			if (pizzaiolo.getDiasTrabalho().contains(dia)) {
				pizzaioloDoDia = pizzaiolo;
			}
		}
		return pizzaioloDoDia;
	}

	@Override
	public String informarIngredientesDoDia(String dia) {
		StringBuffer buffer = new StringBuffer();
		List<TipoPizza> tipoPizzas = null;
		Dias diaAtual = ConverterDia(dia);

		FabricaPizzaiolo pizzaioloDoDia = getPizzaioloDoDia(diaAtual);
		if (pizzaioloDoDia != null) {
			tipoPizzas = pizzaioloDoDia.sabeFazerPizzaDe();
			for (TipoPizza tipoPizza : tipoPizzas) {
				Pizza pizza = null;
				switch (tipoPizza) {
				case CALABRESA:
					pizza = new PizzaCalabresa();
					buffer.append("Ingredientes da Pizza de: " + tipoPizza + "\n");
					buffer.append(pizza.getIngredientes(tipoPizza));
					break;
				case PRESUNTO:
					pizza = new PizzaPresunto();
					buffer.append("Ingredientes da Pizza de: " + tipoPizza + "\n");
					buffer.append(pizza.getIngredientes(tipoPizza));
					break;
				default:
					break;
				}
			}
		} else {
			buffer.append("A pizzaria é fechada aos " + dia.toString() + "s!\n");
		}
		return buffer.toString();
	}
}
