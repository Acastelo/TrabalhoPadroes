package singletonStrategy;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Logger log1 = Logger.getInstancia();
		log1.setAtivo(true);
		log1.mensagem("Event", "PRIMEIRA MENSAGEM DE LOG!");
		System.out.println(log1.toString());
		
		Logger log2 = Logger.getInstancia();
		log2.setAtivo(true);
		log2.mensagem("File", "SEGUNDA MENSAGEM DE LOG!");
		System.out.println(log2.toString());
		
		Logger log3 = Logger.getInstancia();
		log3.setAtivo(true);
		log3.mensagem("Database", "TERCEIRA MENSAGEM DE LOG!");
		System.out.println(log3.toString());
	}

}
