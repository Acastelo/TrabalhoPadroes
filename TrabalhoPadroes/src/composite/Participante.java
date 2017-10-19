package composite;

//Component
public abstract class Participante {

	protected String nome;

	public String getNome() {
		return nome;
	}

	public abstract int getAssento();

	public void adicionar(Participante participante) {

	}

	public void remover(Participante participante) {

	}

}
