package ejercicio5;

import java.util.Scanner;

public class CalificacionFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float participacion, primerExamen, segundoExamen, examenFinal;
		double total;

		System.out.println("Introduzca la nota de participacion:");
		participacion = sc.nextFloat();

		System.out.println("Introduzca la nota del primer examen:");
		primerExamen= sc.nextFloat();
		
		System.out.println("Introduzca la nota del segundo examen:");
		segundoExamen = sc.nextFloat();
		
		System.out.println("Introduzca la nota del examen final");
		examenFinal = sc.nextFloat();

		total=participacion*0.1+primerExamen*0.25+segundoExamen*0.25+examenFinal*0.4;
		
		System.out.println("La nota final es "+total);
	}

}
