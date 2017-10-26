package factoryMethod;

public class ImagemBMP implements ImagemProduct {

	@Override
	public void carregar() {
		// TODO Auto-generated method stub
		System.out.println("Imagem BMP:");
		System.out.println("Carregando imagem BMP...");
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
