package templateMethod;

import java.util.Scanner;

public abstract class TransformaStringAbstract {
	
	//templateMethod
	public final void transformaStringTemplate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a String a ser transformada: ");
		String stringCapturada = scanner.nextLine();
		
		System.out.printf("Transformando a String: %s", stringCapturada);
		
		System.out.println(" --------> String Transformada: "+ transformaString(stringCapturada));
		
	}
	
	protected abstract String transformaString(String string);

}
