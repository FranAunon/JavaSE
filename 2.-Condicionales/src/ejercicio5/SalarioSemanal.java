package ejercicio5;

import javax.swing.JOptionPane;

public class SalarioSemanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horas, sueldo;

		horas = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de horas trabajadas a la semana"));

		if (horas <= 40) {
			sueldo = horas * 16;

		} else {
			sueldo = (40 * 16) + (horas - 40) * 20;
		}

		JOptionPane.showMessageDialog(null, "El sueldo total es " + sueldo);
	}

}
