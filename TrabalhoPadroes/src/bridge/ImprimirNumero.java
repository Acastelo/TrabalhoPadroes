package bridge;

//ImplementadorConcreto
public class ImprimirNumero implements ImprimirLista {

	private int contador = 1;
	@Override
	public void imprimirItemLista(String item) {
		// TODO Auto-generated method stub
		System.out.println(contador++ +"." + item);
	}

}
