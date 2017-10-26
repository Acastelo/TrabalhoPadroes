package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Sensor implements Subject{
	
	private Boolean statusSensor = false;
	private ArrayList<Observer> observadores = new ArrayList<>();
	
	public void alteraSensor(){
		if (statusSensor) {
			statusSensor = false;
		} else {
			statusSensor = true;
		}
		
		notifyObserver();
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
