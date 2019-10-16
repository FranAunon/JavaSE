package ejercicio6;

import java.util.Scanner;

public class CuadradoSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b, total;
		
		System.out.println("Introduzca el numero de a");
		a=sc.nextDouble();
		System.out.println("Introduzca el numero de b");
		b=sc.nextDouble();
		
		total=Math.pow(a, 2)+Math.pow(b, 2)+(2*a*b);
		
		System.out.println("El cuadrado de la suma es "+total);
		
		
		
	}

}
