package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class SistemaAlarme implements Observer, Subject{
	
	private Sensor sensorObservado;
	private ArrayList<Observer> observadores = new ArrayList<>();
	
	public SistemaAlarme(Sensor sensor) {
		this.sensorObservado = sensor;
		sensorObservado.registerObserver(this);
	}
	
	@Override
	public void update(Subject s) {
		if (s == sensorObservado) {
			System.out.println("[INFO] SENSOR ATIVADO. AVISAR: " + 
		SistemaAlarme.class.toString());
			
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
