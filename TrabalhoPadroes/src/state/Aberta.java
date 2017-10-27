package state;

public class Aberta implements DisciplinaState {

	private static Aberta instancia;

	private Aberta() {

	}

	public static Aberta getInstance() {
		if (instancia == null)
			instancia = new Aberta();
		return instancia;
	}

	@Override
	public DisciplinaState ofertada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina ofertada, pois 1 aluno saiu");
		return Ofertada.getInstance();
	}

	@Override
	public DisciplinaState aberta() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina já se encontra Aberta");
		return getInstance();
	}

	@Override
	public DisciplinaState fechada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina fechada, número máximo de alunos atingido");
		return Fechada.getInstance();
	}

	@Override
	public DisciplinaState cancelada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina cancelada(a qualquer momento)");
		return Cancelada.getInstance();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aberta";
	}

}
