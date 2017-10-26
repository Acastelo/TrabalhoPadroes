package factoryMethod;

public class VisualizadorJPG implements FabricaVisualizador {

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		ImagemProduct imagem = new ImagemJPG();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}

}
