package factoryMethod;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaVisualizador fabrica = new VisualizadorJPG();
		fabrica.visualizar();
		
		System.out.println("\n");
		
		fabrica = new VisualizadorBMP();
		fabrica.visualizar();
		
		
	}

}
