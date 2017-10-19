package templateMethod;

public class TransformaStringInvertida extends TransformaStringAbstract {

	@Override
	protected String transformaString(String string) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer(string);
		return buffer.reverse().toString();
	}

}
