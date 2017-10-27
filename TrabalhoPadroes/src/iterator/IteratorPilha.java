package iterator;

import java.util.List;

public class IteratorPilha implements IteratorInterface {

	protected Integer[] lista;
	private int contador;

	public IteratorPilha(Integer[] lista) {
		this.lista = lista;
		contador = 0;
	}

	@Override
	public int proximo() {
		try {
			return lista[contador++];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		return 0;
		
	}

	@Override
	public void remover() {
		System.out.println("JogadorB removeu valor " + lista[contador - 1]);
		Integer[] listaAtual = new Integer[lista.length - 1];
		int aux = 0;
		for (int i = 0; i < lista.length; i++) {
			if (i != contador - 1) {
				listaAtual[aux] = lista[i];
				aux++;
			}
		}
		lista = listaAtual;
		contador--;
	}

	@Override
	public void Final(List<Integer> lista) {
		Integer[] listaAtual = new Integer[this.lista.length + lista.size()];
		int aux = this.lista.length;
//		listaAtual = Arrays.copyOf(this.lista, this.lista.length-1);
		for (Integer valor : lista) {
			System.out.println("JogadorB inseriu valor " + valor + " na posição " + aux);
			listaAtual[aux] = valor;
			aux++;
		}
		for (int i = 0; i < this.lista.length; i++) {
			if(this.lista[i] != null)
				listaAtual[i] = this.lista[i];
		}
		this.lista = listaAtual;
		System.out.print("JogadorB: ");
		for (int i = 0; i < this.lista.length; i++) {
			System.out.print(this.lista[i] + ", ");
		}
		System.out.println("\n");
	}

	@Override
	public boolean estaVazia() {
		int retorno = this.lista.length;
		if (retorno == 0) {
			System.out.println("JogadorB ganhou!");
		}
		return (retorno == 0) ? true : false;
	}

	@Override
	public boolean temProximo() {
		return (lista.length <= 1) ? false : true;
	}
}
