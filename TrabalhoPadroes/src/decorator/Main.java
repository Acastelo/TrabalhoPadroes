package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yogurt yogurtPedido = new Banana();
		System.out.println(yogurtPedido.getNome() + " = " + "R$" + yogurtPedido.getPreco());
		
		yogurtPedido = new FrutaCristalizada(yogurtPedido);
		System.out.println(yogurtPedido.getNome() + " = " + "R$" + yogurtPedido.getPreco());
		
		yogurtPedido = new Castanha(yogurtPedido);
		System.out.println(yogurtPedido.getNome() + " = " + "R$" + yogurtPedido.getPreco());
		
		yogurtPedido = new CaldaChocolate(yogurtPedido);
		System.out.println(yogurtPedido.getNome() + " = " + "R$" + yogurtPedido.getPreco());
		

	}

}
