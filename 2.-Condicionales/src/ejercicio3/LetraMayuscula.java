package ejercicio3;

import javax.swing.JOptionPane;

public class LetraMayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra;

		letra = (JOptionPane.showInputDialog("Introduzca una letra para comprobar si es mayuscula o minuscula"))
				.charAt(0);

		if (Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "La letra es mayuscula");
		} else {
			JOptionPane.showMessageDialog(null, "La letra es minuscula");
		}

	}

}
