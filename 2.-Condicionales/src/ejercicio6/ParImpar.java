package ejercicio6;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1, numero2;

		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));

		if (numero1 % 2 == 0 && numero2 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Los numeros son pares");

		} else if (numero1 % 2 != 0 && numero2 % 2 != 0) {
			JOptionPane.showMessageDialog(null, "Los numeros son impares");

		} else {
			JOptionPane.showMessageDialog(null, "Un numero es par y otro impar");
		}

	}

}
