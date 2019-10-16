package ejercicio7;

import java.util.Scanner;

public class SemanasDiasHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int horasTotales, semanas, dias, horas;

		System.out.println("Introduce el numero de horas");
		horasTotales = sc.nextInt();

		semanas = horasTotales / 168;

		dias = horasTotales % 168 / 24;
		
		horas=horasTotales % 24;
		
		System.out.println("Semanas: "+semanas );
		System.out.println("Dias: "+dias);
		System.out.println("Horas: "+horas);
	}

}
