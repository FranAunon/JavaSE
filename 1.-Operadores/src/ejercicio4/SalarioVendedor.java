package ejercicio4;

import java.util.Scanner;

public class SalarioVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		final int salario = 1000, comisionCoche = 150;
		int numero;
		float valorCoche, comisionVenta;
		double total;

		System.out.println("Introduzca el numero de coches vendidos");
		numero = sc.nextInt();
		
		System.out.println("Introduzca el valor de los coches vendidos");
		valorCoche = sc.nextInt();
		
		total=salario+comisionCoche*numero+valorCoche*0.05;
		
		System.out.println("El salario es "+total);
	}

}
