package ejercicio2;

import java.util.Scanner;

public class SalarioEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float salario, horas, salarioHora;
		
		
		System.out.println("Introduzca el numero de horas trabajadas");
		horas=sc.nextFloat();
		
		System.out.println("Introduzca el salario por hora");
		salarioHora=sc.nextFloat();
		
		salario=horas*salarioHora;
		
		System.out.println("El salario correspondiente es "+salario);
		
}

}
