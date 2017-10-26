package adapter;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorExistenteAdapter());
		
		cliente.executar();

	}

}
