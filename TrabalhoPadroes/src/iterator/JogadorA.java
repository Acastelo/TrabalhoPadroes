package iterator;

import java.util.ArrayList;

public class JogadorA implements Participante {

	protected ArrayList<Integer> lista;

	public JogadorA() {
		lista = new ArrayList<Integer>();
		System.out.print("JogadorA: ");
		for (int i = 0; i < 5; i++) {
			lista.add(Randomic.getRandomNumberInRange(1, 13));
			System.out.print(lista.get(i) + ", ");
		}
		System.out.println("\n");
	}

	@Override
	public IteratorArrayList criarIterator() {
		return new IteratorArrayList(lista);
	}
}
