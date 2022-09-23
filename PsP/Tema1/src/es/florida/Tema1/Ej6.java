package es.florida.Tema1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			int num1 = sc.nextInt();
			suma += num1;
		}
		sc.close();
		System.out.println("La suma total es: " + suma);

	}

}
