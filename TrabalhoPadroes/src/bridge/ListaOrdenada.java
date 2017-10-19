package bridge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Refined Abstraction
public class ListaOrdenada extends ListaAbstrata {

	private List<String> itens = new ArrayList<String>();
	
	public ListaOrdenada(ImprimirLista imprimirLista) {
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
		Collections.sort(itens, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareToIgnoreCase(s2);
			}
			
		});
		for (String string : itens) {
			imprimirLista.imprimirItemLista(string);
		}
		
	}

}
