package singletonStrategy;

public class Logger {
	private boolean ativo = false;
	private LoggerStrategia logger;
	public static Logger loggerInstancia;
	
	protected Logger(){
	}
	
	public static Logger getInstancia(){
		if (loggerInstancia == null)
			loggerInstancia =  new Logger();
		return loggerInstancia;
	}
	
	public boolean isAtivo(){
		return this.ativo;
	}
	
	public void setAtivo(boolean b) {
		this.ativo = b;
	}
	
	public void mensagem(String tipoLog, String msn) {
		if(tipoLog == "Event"){
			logger = new LoggerEventViewer();
			logger.log(msn);
		} else if(tipoLog == "File"){
			logger = new LoggerFile();
			logger.log(msn);
		} else {
			logger = new LoggerDatabase();
			logger.log(msn);
		}

	}

}
