package iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorArrayList implements IteratorInterface {

	private ArrayList<Integer> lista;
	private int contador;
	
	public IteratorArrayList(ArrayList<Integer> lista) {
		this.lista = lista;
		contador = 0;
	}

	@Override
	public int proximo() {
		return lista.get(contador++);
	}

	@Override
	public void remover() {
		System.out.println("JogadorA removeu valor " + lista.get(contador-1));
		lista.remove(--contador);
	}

	@Override
	public void Final(List<Integer> lista) {
		for (int valor : lista) {
			System.out.println("JogadorA inseriu valor " + valor + " na posição " + this.lista.size());
			this.lista.add(this.lista.size(), valor);
		}
		System.out.print("JogadorA: ");
		for (int i = 0; i < this.lista.size(); i++) {
			System.out.print(this.lista.get(i) + ", ");
		}
		System.out.println("\n");
	}

	@Override
	public boolean estaVazia() {
		if(lista.isEmpty()) {
			System.out.println("JogadorA ganhou!");
		}
		return lista.isEmpty();
	}

	@Override
	public boolean temProximo() {
		return (lista.size() <= 1) ? false : true;
	}
}
