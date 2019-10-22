package ejercicio7;

import javax.swing.JOptionPane;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));

		if (num1 > num2 && num2 > num3) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num1 + ", " + num2 + ", " + num3);
		} else if (num2 > num1 && num1 > num3) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num2 + ", " + num1 + ", " + num3);
		} else if (num3 > num1 && num1 > num2) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num3 + ", " + num1 + ", " + num2);
		} else if (num1 > num3 && num3 > num2) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num1 + ", " + num3 + ", " + num2);
		} else if (num2 > num3 && num3 > num1) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num2 && num2 > num1) {
			JOptionPane.showMessageDialog(null,
					"Los numeros ordenados de mayor a menor son: " + num3 + ", " + num2 + ", " + num1);
		} else {
			JOptionPane.showMessageDialog(null, "Hay numeros iguales y no se pueden ordenar de mayor a menor");
		}

	}

}
