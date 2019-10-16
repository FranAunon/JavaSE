package ejercicio3;

import java.util.Scanner;

public class SumaDinero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		float guillermo, luis, juan, total;
		
		System.out.println("Introduce la cantidad de dolares que posee Guillermo: ");
		guillermo=sc.nextFloat();
		
		luis=guillermo/2;
		juan=(guillermo+luis)/2;
		
		total=guillermo+luis+juan;
		
		System.out.println("La cantidad total de dinero es "+total);
		
			
	}

}
