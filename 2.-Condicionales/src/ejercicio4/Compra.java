package ejercicio4;

import javax.swing.JOptionPane;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, precioFinal;

		precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de su compra"));

		if (precio > 300) {
			precioFinal = precio - precio * 0.2;
			JOptionPane.showMessageDialog(null, "Usted tiene un descuento del 20%, el precio final de su compra es "+precioFinal);

		}else {
			JOptionPane.showMessageDialog(null, "Usted no tiene un descuento del 20%, el precio final de su compra es "+precio);

		}
		
		
	}

}
