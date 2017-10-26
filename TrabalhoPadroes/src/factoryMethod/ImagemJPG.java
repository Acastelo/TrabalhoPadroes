package factoryMethod;

public class ImagemJPG implements ImagemProduct {

	@Override
	public void carregar() {
		// TODO Auto-generated method stub
		System.out.println("Imagem JPG:");
		System.out.println("Carregando imagem JPG...");
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo imagem por 20 segundos");
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		System.out.println("Fechando imagem");
		
	}

}
