package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Delegacia implements Observer, Subject{
	
	private SistemaAlarme alarmeObservado;
	private ArrayList<Observer> observadores = new ArrayList<>();
	
	public Delegacia(SistemaAlarme sistemaAlarme) {
		this.alarmeObservado = sistemaAlarme;
		alarmeObservado.registerObserver(this);
	}
	
	@Override
	public void update(Subject s) {
		if (s == alarmeObservado) {
			System.out.println("[INFO] SENSOR ATIVADO. AVISAR: " + 
		Delegacia.class.toString());
			
		}
		
	}

	@Override
	public void registerObserver(Observer o) {
		observadores.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observadores.remove(o);		
	}

	@Override
	public void notifyObserver() {
		Iterator<Observer> i = observadores.iterator();
		while (i.hasNext()) {
			Observer o = (Observer) i.next();
			o.update(this);
			
		}		
	}
}
