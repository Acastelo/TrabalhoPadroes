package abstractFactory;

import java.util.List;

public interface Pizzaria {

	public enum Dias { SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO };
	
	public List<FabricaPizzaiolo> contratarPizzaiolos();
	
	public List<FabricaPizzaiolo> getPizzaiolos();
	
	public Dias ConverterDia(String dia);
}
