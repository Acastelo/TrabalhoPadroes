package composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Instituicao extends Participante {

	public List<Participante> participantes = new ArrayList<Participante>();

	public Instituicao(String nome) {
		this.nome = nome;
	}

	@Override
	public void adicionar(Participante participante) {
		this.participantes.add(participante);
	}

	@Override
	public void remover(Participante participante) {
		for (Participante participanteTemp : participantes) {
			if (participanteTemp.getNome().equalsIgnoreCase(participante.getNome())) {
				this.participantes.remove(participanteTemp);
				System.out.printf("\nParticipante %s Removido Com Sucesso", participanteTemp.getNome());
				return;
			}
		}
	}

	public void imprimirMembros() {
		for (Participante participante : participantes) {
			System.out.println("participante: " + participante.getNome() + " Instituição: " + this.nome);

		}
	}

	@Override
	public int getAssento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
