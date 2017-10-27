package state;

public interface DisciplinaState {
	
	DisciplinaState ofertada();
	DisciplinaState aberta();
	DisciplinaState fechada();
	DisciplinaState cancelada();

}
