package state;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	DisciplinaState estado;

	private String nomeDisciplina;
	private int numeroVagas;
	private List<Aluno> alunos;
	private boolean isCancelada;

	public Disciplina(String nome, int numeroDeVagas) {
		// TODO Auto-generated constructor stub
		if (numeroDeVagas <= 0) {
			this.numeroVagas = 2;
			
		} else {
			this.numeroVagas = numeroDeVagas;
		}
		this.nomeDisciplina = nome;
		this.alunos = new ArrayList<Aluno>();
		this.isCancelada = false;
		this.estado = Ofertada.getInstance();
	}

	public int getAlunosMatriculados() {
		return alunos.size();
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void ofertada() {
		isCancelada = false;
		this.estado = estado.ofertada();
	}

	public void aberta() {
		// TODO Auto-generated method stub
		this.estado = estado.aberta();

	}

	public void fechada() {
		// TODO Auto-generated method stub
		this.estado = estado.fechada();
	}

	public void cancelada() {
		// TODO Auto-generated method stub
		isCancelada = true;
		this.estado = estado.cancelada();

	}

	public void realizarMatricula(Aluno aluno) {
		if (this.numeroVagas == 0) {
			System.out.println("Disciplina está cheia");
			fechada();
			return;
		}

		if (!isCancelada) {
			alunos.add(aluno);
			System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
			this.numeroVagas--;
			aberta();
			return;

		}
		System.out.println("Matrícula não realizada, pois disciplina estado: " + estado.toString());

	}

	public void sairDisciplina(Aluno aluno) {
		alunos.remove(aluno);
		System.out.println("Aluno " + aluno.getNome() + " saiu da disciplina: " + this.getNomeDisciplina());
		this.numeroVagas++;
		ofertada();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomeDisciplina + " " + this.estado;
	}

}
