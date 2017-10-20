package abstractFactory;

import java.util.ArrayList;
import java.util.List;

import abstractFactory.Pizzaria.Dias;

public abstract class PizzaioloAbstract implements FabricaPizzaiolo {

	protected List<Pizza.TipoPizza> pizzas;
	protected FabricaPizzaiolo pizzaiolo;
	protected List<Dias> diasTrabalho;
	protected String nome;

	public PizzaioloAbstract() {
		pizzas = new ArrayList<Pizza.TipoPizza>();
	}
	
	public abstract List<Pizza.TipoPizza> sabeFazerPizzaDe();
	
	@Override
	public abstract String getNome();
	
	@Override
	public FabricaPizzaiolo getPizzaiolo() {
		return pizzaiolo;
	}

	@Override
	public List<Dias> getDiasTrabalho() {
		return diasTrabalho;
	}

	@Override
	public void setDiasTrabalho(List<Dias> diasTrabalho) {
		this.diasTrabalho = diasTrabalho;
	}
}
