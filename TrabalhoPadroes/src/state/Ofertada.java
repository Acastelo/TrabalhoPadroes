package state;

public class Ofertada implements DisciplinaState {

	private static Ofertada instancia;

	private Ofertada() {

	}

	public static Ofertada getInstance() {
		if (instancia == null)
			instancia = new Ofertada();
		return instancia;
	}
	
	@Override
	public DisciplinaState ofertada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina já se encontra ofertada");
		return getInstance();
	}

	@Override
	public DisciplinaState aberta() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina aberta: 1 aluno matriculado");
		return Aberta.getInstance();
	}

	@Override
	public DisciplinaState fechada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina não pode ser fechada");
		return this;
	}

	@Override
	public DisciplinaState cancelada() {
		// TODO Auto-generated method stub
		System.out.println("Sem alunos matriculados, disciplina pode ser cancelada");
		return Cancelada.getInstance();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ofertada";
	}

}
