package iterator;

public class JogadorB implements Participante {

	protected Integer[] lista;

	public JogadorB() {
		lista = new Integer[5];
		System.out.print("JogadorB: ");
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Randomic.getRandomNumberInRange(1, 13);
			System.out.print(lista[i] + ", ");
		}
		System.out.println("\n");
	}

	@Override
	public IteratorPilha criarIterator() {
		return new IteratorPilha(lista);
	}
}