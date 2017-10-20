package abstractFactory;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class PizzariaAbstract implements Pizzaria {

	protected List<FabricaPizzaiolo> pizzaiolos;

	protected PizzariaAbstract() {
		pizzaiolos = new ArrayList<FabricaPizzaiolo>();
	}

	@Override
	public abstract List<FabricaPizzaiolo> contratarPizzaiolos();

	public String diasSemana(Calendar cal) {
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}

	@Override
	public List<FabricaPizzaiolo> getPizzaiolos() {
		return pizzaiolos;
	}

	@Override
	public Dias ConverterDia(String dia) {
		Dias retorno = null;
		switch (dia) {
		case "Segunda-feira":
			retorno = Dias.SEGUNDA;
			break;
		case "Terça-feira":
			retorno = Dias.TERÇA;
			break;
		case "Quarta-feira":
			retorno = Dias.QUARTA;
			break;
		case "Quinta-feira":
			retorno = Dias.QUINTA;
			break;
		case "Sexta-feira":
			retorno = Dias.SEXTA;
			break;
		case "Sábado":
			retorno = Dias.SABADO;
			break;
		case "Domingo":
			retorno = Dias.DOMINGO;
			break;
		default:
			break;
		}
		return retorno;
	}
}
