import java.util.Scanner;

import javax.swing.JOptionPane;

public class OptionPanel {
	static int numOne = 0;
	static int numTwo = 0;
	
	public static void main(String[] args) {
		//Realiza que ingrese 2 datos numéricos y que devuelva la diferencia
		JOptionPane.showMessageDialog(null, "Realizaremos la resta de dos años para obtener una edad\nPor favor ingresar solo números!!");
		try {
			numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un año a restar"));
			numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un año a restar"));
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese solo números");
			main(args);
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(null, numOne - numTwo);
		
		consoleInputs();
	}
	/**
	 * Función para obtener datos por consola
	 *  */ 
	public static void consoleInputs() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese algo por consola:");
		String entrada = scanner.nextLine();
		System.out.println("Esto es lo que ingresaste:"+" "+entrada);
		
		}
	}
