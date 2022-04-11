
public class ConversionTipo {
	public static void main(String[] args) {
		
		int numOne = Integer.parseInt("54");
		System.out.println(numOne);
		
		short numOneOne = Short.parseShort("45");
		System.out.println(numOneOne);
		
		double numTwo = Double.parseDouble("1997");
		System.out.println(numTwo);
		
		boolean value = Boolean.parseBoolean("TruE");
		System.out.println(value);
		
		int numString = 180;
		String stringNum = "";
		//ringNum = Integer.toString(numString);
		System.out.println(String.valueOf(numString));
	}
}
