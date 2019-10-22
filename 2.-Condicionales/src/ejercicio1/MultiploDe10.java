package ejercicio1;

import javax.swing.JOptionPane;

public class MultiploDe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

//		if (numero % 10 == 0) {
//			JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
//		} else {
//			JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
//		}
		
		String mensaje=(numero%10==0)?"El numero es multiplo de 10":"El numero no es multiplo de 10";
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
