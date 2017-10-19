package composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso {

	public String nomeCongresso;
	public int totalAssento;
	public List<Participante> participantes = new ArrayList<Participante>();

	public Congresso(String nomeCongresso, int totalAssento) {
		this.nomeCongresso = nomeCongresso;
		
		if(totalAssento > 0) {
			this.totalAssento = totalAssento;
		} else {
			this.totalAssento = 0;
		}
	}

	public int getTotalPartipantes() {
		return participantes.size();
	}

	public void adicionarParticipante(Participante participante) {
		if (isCongressoCheio(totalAssento)) {

			System.out.println("\nO congresso já está cheio! Não é possível inscrever o participante: "+ 
			participante.getNome() + "!");

		} else if (isInstituicao(participante)) {

			List<Participante> listaParticipantesInstituicao = new ArrayList<Participante>();
			listaParticipantesInstituicao.addAll(((Instituicao) participante).participantes);

			for (Participante partipanteTemp : listaParticipantesInstituicao) {
				if(!isCongressoCheio(totalAssento) && !isMesmoAssento(partipanteTemp)) {
					participantes.add(partipanteTemp);
					totalAssento = totalAssento - 1;
				} else {
					System.out.println("\nO congresso já está cheio! Não é possível inscrever mais participantes");
				}
			}

		} else if(!isMesmoAssento(participante)){
			participantes.add(participante);
			totalAssento = totalAssento - 1;
		} else {
			System.out.println("\nTentando inserir participante no mesmo assento!");
		}

	}

	public void imprimeParticipantes() {
		for (Participante participante : participantes) {
			System.out.printf("\nParticipante: %s ----> Assento: %d", participante.getNome(),
					participante.getAssento());
		}
	}

	@Override
	public String toString() {
		return String.format("\nNome Congresso: %s \nTotal assentos: %d \nTotal Partipantes: %d", this.nomeCongresso,
				this.totalAssento, getTotalPartipantes());
	}

	private boolean isInstituicao(Participante participante) {
		return participante instanceof Instituicao ? true : false;
	}
	
	private boolean isCongressoCheio(int TotalAssento) {
		return totalAssento <= 0? true : false;
	}
	
	private boolean isMesmoAssento(Participante participante) {
		for (Participante partipanteTemp : participantes) {
			if(partipanteTemp.getAssento() == participante.getAssento()) {
				return true;
			} 
			
		}
		return false;
	}
}
