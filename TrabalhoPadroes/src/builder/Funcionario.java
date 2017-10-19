package builder;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Funcionario {

	private Pedido pedido;
	
	public Funcionario(){
		pedido = new Pedido();
	}
	
	public void embalarItens(List<ItemProduct> itens) {
		double total = 0.0;
		Locale localeBR = new Locale( "pt", "BR" );  
		NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
		for (ItemProduct item : itens) {
			String quantidade = "";
			String nome = "";
			String precoUnitario = "";
			String precoParcial = "";
			double parcial = 0.0;

			quantidade = Integer.toString(item.getQuantidade());
			nome = item.getNome();
			precoUnitario = dinheiroBR.format(item.getPreco());
			parcial = (item.getPreco() * (double)item.getQuantidade());
			precoParcial = dinheiroBR.format(parcial);
			
			switch (item.tipo) {
			case SANDUICHE:
			case BATATA:
			case BRINQUEDO:
				pedido.adicionarDentroDaCaixa(quantidade + " " + nome + " " + precoUnitario + " " + precoParcial);
				break;
			case REFRIGERANTE:
				pedido.adicionarForaDaCaixa(quantidade + " " + nome + " " + precoUnitario + " " + precoParcial);
				break;
			default:
				break;
			}
			
			total += parcial;
		}
		
		System.out.println(pedido.toString());
		System.out.println("Preço Total: " + dinheiroBR.format(total));
	}

}
