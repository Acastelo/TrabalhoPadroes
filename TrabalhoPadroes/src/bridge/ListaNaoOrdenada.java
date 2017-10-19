package bridge;

import java.util.ArrayList;
import java.util.List;

//Refined Abstraction
public class ListaNaoOrdenada extends ListaAbstrata{

	private List<String> itens = new ArrayList<String>();
	
	public ListaNaoOrdenada(ImprimirLista imprimirLista) {
		super(imprimirLista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionar(String s) {
		// TODO Auto-generated method stub
		itens.add(s);
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		for (String string : itens) {
			imprimirLista.imprimirItemLista(string);
		}
	}

}
