package observer;

public class CiaSeguros implements Observer{

	private Delegacia delegacia;
	
	public CiaSeguros(Delegacia delegacia) {
		this.delegacia = delegacia;
		delegacia.registerObserver(this);
	}
	
	@Override
	public void update(Subject s) {
		if (s == delegacia) {
			System.out.println("[INFO] SENSOR ATIVADO. AVISAR: " + 
		CiaSeguros.class.toString());
			
		}
		
	}

}
