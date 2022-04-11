import java.util.Scanner;

import javax.swing.JOptionPane;

public class OptionPanel {
	static int numOne = 0;
	static int numTwo = 0;
	
	public static void main(String[] args) {
		//Realiza que ingrese 2 datos num�ricos y que devuelva la diferencia
		JOptionPane.showMessageDialog(null, "Realizaremos la resta de dos a�os para obtener una edad\nPor favor ingresar solo n�meros!!");
		try {
			numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un a�o a restar"));
			numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un a�o a restar"));
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese solo n�meros");
			main(args);
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(null, numOne - numTwo);
		
		consoleInputs();
	}
	/**
	 * Funci�n para obtener datos por consola
	 *  */ 
	public static void consoleInputs() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese un n�mero por consola o muere");
			int entrada = scanner.nextInt();
			System.out.println("Esto es lo que ingresaste:"+" "+entrada);
			
		}catch(Exception e) {
			System.out.println("Debe de ingresar enteros");
			consoleInputs();
			System.exit(1);
		}
 		
		
		}
	}
