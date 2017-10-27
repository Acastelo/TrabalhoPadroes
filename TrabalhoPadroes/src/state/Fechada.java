package state;

public class Fechada implements DisciplinaState {

	private static Fechada instancia;

	private Fechada() {

	}

	public static Fechada getInstance() {
		if (instancia == null)
			instancia = new Fechada();
		return instancia;
	}
	
	@Override
	public DisciplinaState ofertada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina não pode ser ofertada, está cheia");
		return this;
	}

	@Override
	public DisciplinaState aberta() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina aberta, pelo menos 1 aluno saiu");
		return Aberta.getInstance();
	}

	@Override
	public DisciplinaState fechada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina já se encontra fechada");
		return this;
	}

	@Override
	public DisciplinaState cancelada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina fechada não pode ser cancelada");
		return this;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fechada";
	}

}
