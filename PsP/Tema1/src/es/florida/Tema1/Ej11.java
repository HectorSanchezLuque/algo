package es.florida.Tema1;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = " ";
		char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


		
		
		System.out.println("Introduzca los números de su DNI");
		
		while (num.length() != 8) {
			num = sc.nextLine();
		}
		sc.close();
		int numDni = Integer.parseInt(num);
		int numLetra = numDni % 23;
		System.out.println(numLetra);
		
		num = Integer.toString(numDni) + letra[numLetra];
		System.out.println(num);
		
		
		

	}

}
