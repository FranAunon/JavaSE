package ejercicio8;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2;

		System.out.println("Introduce el numero de a");
		a = sc.nextDouble();

		System.out.println("Introduce el numero de b");
		b = sc.nextDouble();
		
		System.out.println("Introduce el numero de c");
		c = sc.nextDouble();
		
		x1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		
		System.out.println("El valor de x es "+x1);
		System.out.println("El valor de x es "+x2);
	}

}
