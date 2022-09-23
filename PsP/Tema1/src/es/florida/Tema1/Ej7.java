package es.florida.Tema1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int suma = 0;
		
		while (i < 5) {
			int num1 = sc.nextInt();
			suma += num1;
			i++;
		}
		sc.close();
		
		System.out.println("La suma total es: "+ suma);

	}

}
