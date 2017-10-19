package builder;

import java.util.ArrayList;


public class Atendente {
	
	protected ItemBuilder montadora;
	private static ArrayList<ItemProduct> itens;
	public static Atendente instancia;
	
	protected Atendente() {
		
	}
	
	public static Atendente getInstancia() {
		if(instancia == null) {
			instancia = new Atendente();
			itens = new ArrayList<ItemProduct>();
		}
		return instancia;
	}
	
	public void adicionarProduto(ItemBuilder montadora) {
		this.montadora = montadora;
	}

	public void montarItem(int quantidade) {
		montadora.buildPreco();
		montadora.buildNome();
		montadora.buildTipo();
		montadora.buildQuantidade(quantidade);
		
		itens.add(this.getItem().copy());
	}
	
	public void fecharPedido() {
		Funcionario funcionario = new Funcionario();
		funcionario.embalarItens(itens);
	}
	
	public ItemProduct getItem() {
		return montadora.getItem();
	}
}
