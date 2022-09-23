package es.florida.Tema1;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String passDV = "Hola123";
		
		boolean acceder = false;
		do {
			
			String pass = sc.nextLine();
			
			if (passDV.contentEquals(pass)) {
				System.out.println("Has podido acceder con éxito");
				acceder = true;
			} else {
				System.out.println("No se ha podido acceder");
			}	
		} while (!acceder);
		
	}

}
