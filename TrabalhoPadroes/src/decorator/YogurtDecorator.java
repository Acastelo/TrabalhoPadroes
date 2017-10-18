package decorator;

public abstract class YogurtDecorator extends Yogurt {
	Yogurt yogurt;

	public YogurtDecorator(Yogurt yogurt) {
		// TODO Auto-generated constructor stub
		this.yogurt = yogurt;
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return yogurt.getNome() + " + " + nome;
	}
	
	public double getPreco() {
		return yogurt.getPreco() + preco;
	}
	
	
}
