package es.florida.Tema1;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String passDV = "Hola123";
		String pass = sc.nextLine();
		
		if (passDV.contentEquals(pass)) {
			System.out.println("Has podido acceder con éxito");
		} else {
			System.out.println("No se ha podido acceder");
		}
	}

}
