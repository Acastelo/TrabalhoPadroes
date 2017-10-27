package state;

public class Aluno {

	private String nome;

	public Aluno(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void matricularEmDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		disciplina.realizarMatricula(this);

	}

	public void sairDaDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		disciplina.sairDisciplina(this);
	}

}
