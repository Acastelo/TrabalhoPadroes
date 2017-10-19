package Chain;

public class Cliente {

	public static void main(String[] args) {
		MaquinaChain itens = new Refrigerante();
		itens.setNext(new Salgadinho());
		
		try {
			itens.escolherItem(SlotsEnum.REFRIGERANTE);
			itens.escolherItem(SlotsEnum.SALGADINHO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
