package bridge;

//Abstracao
public abstract class ListaAbstrata {
	
	protected ImprimirLista imprimirLista;
	
	public ListaAbstrata(ImprimirLista imprimirLista) {
		// TODO Auto-generated constructor stub
		this.imprimirLista = imprimirLista;
	}
	
	public abstract void adicionar(String s);
	
	public abstract void imprimir();

}
