
public class Primitivo {
	public static void main(String [] args) {
		
		byte numeroRandom = 127;
		System.out.println("===== Byte =======");
		System.out.println("Cuanto ocupa un byte " + Byte.SIZE);
		System.out.println("Máximo " + Byte.MAX_VALUE);
		System.out.println("Mínimo" + Byte.MIN_VALUE);
		
		short numShort = 32767;		
		System.out.println("===== short =======");
		System.out.println("Cuanto ocupa un short " + Short.SIZE);
		System.out.println("Máximo " + Short.MAX_VALUE);
		System.out.println("Mínimo" + Short.MIN_VALUE);
		
		System.out.println("===== Integer =======");
		System.out.println("Cuanto ocupa un Integer " + Integer.SIZE);
		System.out.println("Máximo " + Integer.MAX_VALUE);
		System.out.println("Mínimo" + Integer.MIN_VALUE);
		
		System.out.println("===== Long =======");
		System.out.println("Cuanto ocupa un Long " + Long.SIZE);
		System.out.println("Máximo " + Long.MAX_VALUE);
		System.out.println("Mínimo" + Long.MIN_VALUE);
		
		System.out.println("===== Float =======");
		System.out.println("Cuanto ocupa un Float " + Float.SIZE);
		System.out.println("Máximo " + Float.MAX_VALUE);
		System.out.println("Mínimo" + Float.MIN_VALUE);
		
		System.out.println("===== Double =======");
		System.out.println("Cuanto ocupa un Double " + Double.SIZE);
		System.out.println("Máximo " + Double.MAX_VALUE);
		System.out.println("Mínimo" + Double.MIN_VALUE);
	}
}
