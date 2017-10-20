package abstractFactory;

import java.util.List;

import abstractFactory.Pizzaria.Dias;

public interface FabricaPizzaiolo {
	
	public List<Pizza.TipoPizza> sabeFazerPizzaDe();
	
	public FabricaPizzaiolo getPizzaiolo();
	
	public List<Dias> getDiasTrabalho();
	
	public void setDiasTrabalho(List<Dias> diasTrabalho);
	
	public String getNome();
}
