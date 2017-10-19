package templateMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransformaStringAbstract transformaString = new TransformaStringMaiuscula();
		
		System.out.println("TRANSFORMANDO A STRING EM MAIÚSCULA");
		transformaString.transformaStringTemplate();
		
		transformaString = new TransformaStringMinuscula();
		System.out.println("\nTRANSFORMANDO A STRING EM MINÚSCULA");
		transformaString.transformaStringTemplate();
		
		transformaString = new TransformaStringInvertida();
		System.out.println("\nINVERTENDO A STRING");
		transformaString.transformaStringTemplate();
		
		transformaString = new TransformaStringDuplicada();
		System.out.println("\nDUPLICANDO A STRING");
		transformaString.transformaStringTemplate();
	}

}
