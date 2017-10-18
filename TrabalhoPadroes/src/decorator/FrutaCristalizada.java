package decorator;

public class FrutaCristalizada extends YogurtDecorator {

	public FrutaCristalizada(Yogurt yogurt) {
		super(yogurt);
		// TODO Auto-generated constructor stub
		nome = "Topo com Frutas Cristalizadas";
		preco = 1.0;
	}

}
