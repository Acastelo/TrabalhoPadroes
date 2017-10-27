package state;

public class Main {
	public static void main(String[] args) {
		Disciplina disciplina = new Disciplina("Padrões de Software", 2);
		System.out.println(disciplina.toString());
		
		Aluno aluno1 = new Aluno("Fernando");
		Aluno aluno2 = new Aluno("Davi");
		
		aluno1.matricularEmDisciplina(disciplina);
		aluno2.matricularEmDisciplina(disciplina);
		
		aluno1.sairDaDisciplina(disciplina);
		aluno2.sairDaDisciplina(disciplina);
		
		aluno1.matricularEmDisciplina(disciplina);
		aluno2.matricularEmDisciplina(disciplina);
		
		disciplina.fechada();
		
	}
}
