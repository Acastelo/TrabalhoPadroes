package composite;

//Leaf
public class Individuo extends Participante {

	private int assento;

	public int getAssento() {
		return assento;
	}

	public Individuo(String nome, int assento) {
		this.nome = nome;
		this.assento = assento;
	}

}
