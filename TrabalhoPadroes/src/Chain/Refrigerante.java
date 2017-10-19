package Chain;

public class Refrigerante extends MaquinaChain {
	
	public Refrigerante() {
		super(SlotsEnum.REFRIGERANTE);
	}
	
	@Override
	protected void escolheItem() {
		System.out.println("Escolhido refrigerante");
	}

}
