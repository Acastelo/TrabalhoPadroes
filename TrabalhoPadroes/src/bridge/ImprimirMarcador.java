package bridge;

//ImplementadorConcreto
public class ImprimirMarcador implements ImprimirLista {

	private char marcador = '*';
	
	public ImprimirMarcador(char marcador) {
		// TODO Auto-generated constructor stub
		this.marcador = marcador;
	}
	
	@Override
	public void imprimirItemLista(String item) {
		// TODO Auto-generated method stub
		System.out.println(marcador +" "+ item);
		
	}
	

}
