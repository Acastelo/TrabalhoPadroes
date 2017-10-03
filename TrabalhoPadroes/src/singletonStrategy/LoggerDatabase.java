package singletonStrategy;

public class LoggerDatabase implements LoggerStrategia {
	public void log(String s) {
		System.out.println("LOG: Database: " + s);
	}

}
