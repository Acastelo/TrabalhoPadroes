package observer;

public class GerenciadorAlarme {

	public static void main(String[] args) {
		
		Sensor sensor = new Sensor();
		
		SistemaAlarme obs1 = new SistemaAlarme(sensor);
		Delegacia obs2 = new Delegacia(obs1);
		CiaSeguros obs3 = new CiaSeguros(obs2);
		
		
		sensor.alteraSensor();
		
		obs1.update(sensor);
		obs2.update(obs1);
		obs3.update(obs2);
	}

}
