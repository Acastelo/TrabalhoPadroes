package bridge;

//ImplementadorConcreto
public class ImprimirLetra implements ImprimirLista {

	private char letra = 'a';
	
	@Override
	public void imprimirItemLista(String item) {
		// TODO Auto-generated method stub
		System.out.println(letra++ +") "+ item);
		
	}

}
