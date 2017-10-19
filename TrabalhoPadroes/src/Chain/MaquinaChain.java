package Chain;

public abstract class MaquinaChain {
	
	protected MaquinaChain next;
	protected SlotsEnum valorMoeda;
	
	public MaquinaChain(SlotsEnum valor){
		next = null;
		valorMoeda = valor;
	}
	
	public void setNext(MaquinaChain item) {
		if (next == null){
			this.next = item;
		} else {
			next.setNext(item);
		}
	}
	
	public void escolherItem(SlotsEnum valor) throws Exception {
		if (podeEscolherItem(valor)){
			escolheItem();
		} else {
			if (next == null) {
				throw new Exception("Valor insuficiente para este item");
			}
			next.escolherItem(valor);
		}
	}
	
	private boolean podeEscolherItem (SlotsEnum valor){
		if (valorMoeda == valor) {
			return true;
		}
		return false;
	}
	
	protected abstract void escolheItem();

}
