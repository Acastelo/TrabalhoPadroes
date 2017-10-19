package templateMethod;

public class TransformaStringDuplicada extends TransformaStringAbstract {

	@Override
	protected String transformaString(String string) {
		// TODO Auto-generated method stub
		return string + " "+ string;
	}

}
