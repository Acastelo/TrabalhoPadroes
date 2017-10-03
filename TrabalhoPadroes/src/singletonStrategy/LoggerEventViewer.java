package singletonStrategy;

public class LoggerEventViewer implements LoggerStrategia {

	public void log(String s) {
		System.out.println("LOG: Event Viewer: " + s);
	}

}
