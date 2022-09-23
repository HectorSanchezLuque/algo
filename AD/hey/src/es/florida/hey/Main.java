package es.florida.hey;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("nom: ");
		String nombre = teclado.nextLine();
		System.out.println("hey" + " " + nombre);
		teclado.close();
		Persona persona1 = new Persona();
		persona1.setNom("Gustavo");
		persona1.setEdat(28);
		persona1.setCognom("Martínez");
		System.out.println(persona1.toString());
	}

}
