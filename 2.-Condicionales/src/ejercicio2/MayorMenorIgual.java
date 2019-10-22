package ejercicio2;

import javax.swing.JOptionPane;

public class MayorMenorIgual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1, numero2;

		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero"));

		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero"));

		if (numero1 < numero2) {
			JOptionPane.showMessageDialog(null, numero2 + " es mayor que " + numero1);
		} else if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, numero1 + " es mayor que " + numero2);
		} else {
			JOptionPane.showMessageDialog(null, "Los numero son iguales");
		}
		
	

	}

}
