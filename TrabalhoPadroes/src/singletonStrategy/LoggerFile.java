package singletonStrategy;

public class LoggerFile implements LoggerStrategia {

	public void log(String s) {
		System.out.println("LOG: File: " + s);
	}

}
