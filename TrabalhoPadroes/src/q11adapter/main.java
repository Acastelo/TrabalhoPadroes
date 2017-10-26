package q11adapter;

public class main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorExistenteAdapter());
		
		cliente.executar();

	}

}
