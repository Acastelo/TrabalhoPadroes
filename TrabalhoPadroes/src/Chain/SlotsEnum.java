package Chain;

public enum SlotsEnum {
	
	REFRIGERANTE(100), SALGADINHO(250);
	
	private final int valorMoeda;
	
	private SlotsEnum(int valor) {
		valorMoeda = valor;
	}
	
	public int getValorMoeda() {
		return valorMoeda;
	}
}
