package state;

public class Cancelada implements DisciplinaState {

	private static Cancelada instancia;

	private Cancelada() {

	}

	public static Cancelada getInstance() {
		if (instancia == null)
			instancia = new Cancelada();
		return instancia;
	}
	
	@Override
	public DisciplinaState ofertada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina novamente ofertada");
		return Ofertada.getInstance();
	}

	@Override
	public DisciplinaState aberta() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina n�o pode ser aberta");
		return this;
	}

	@Override
	public DisciplinaState fechada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina n�o pode ser fechada");
		return this;
	}

	@Override
	public DisciplinaState cancelada() {
		// TODO Auto-generated method stub
		System.out.println("Disciplina j� est� cancelada");
		return this;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cancelada";
	}

}
