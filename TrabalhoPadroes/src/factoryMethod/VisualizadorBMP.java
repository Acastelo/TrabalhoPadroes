package factoryMethod;

public class VisualizadorBMP implements FabricaVisualizador {

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		ImagemProduct imagem = new ImagemBMP();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}

}
