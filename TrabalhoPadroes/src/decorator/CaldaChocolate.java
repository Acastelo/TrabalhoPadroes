package decorator;

public class CaldaChocolate extends YogurtDecorator {

	public CaldaChocolate(Yogurt yogurt) {
		super(yogurt);
		// TODO Auto-generated constructor stub
		nome = "Cobertura Calda de Chocolate";
		preco = 1.0;
	}

}
