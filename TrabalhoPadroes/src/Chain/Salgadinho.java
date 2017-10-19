package Chain;

public class Salgadinho extends MaquinaChain{

	public Salgadinho() {
		super(SlotsEnum.SALGADINHO);
	}

	@Override
	protected void escolheItem() {
		System.out.println("Escolhido salgadinho");
	}

}
