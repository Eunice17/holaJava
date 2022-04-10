import javax.swing.JOptionPane;

public class OptionPanel {
	static String enterOne = "";
	static String enterTwo = "";
	static int numOne = 0;
	static int numTwo = 0;
	public static void main(String[] args) {
		//Realiza que ingrese 2 datos num�ricos y que devuelva la diferencia
		boolean flag = false;
		JOptionPane.showMessageDialog(null, "Realizaremos la resta de dos a�os para obtener una edad\nPor favor ingresar solo n�meros!!");
		do {
			enterOne = JOptionPane.showInputDialog(null, "Ingresa un a�o a restar");
			enterTwo = JOptionPane.showInputDialog(null, "Ingresa un a�o a restar");
			flag = notIsNumber(enterOne, enterTwo);
			
		} while(!flag);
		
		JOptionPane.showMessageDialog(null, numOne - numTwo);
	}
	public static boolean notIsNumber(String enterOne, String enterTwo) {
		try {
			numOne = Integer.parseInt(enterOne);
			numTwo = Integer.parseInt(enterTwo);
			return true;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese valores num�ricos!");
			return false;
		}
	}
}
