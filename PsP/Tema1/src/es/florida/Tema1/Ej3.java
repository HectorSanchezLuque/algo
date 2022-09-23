package es.florida.Tema1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int suma = num1 + num2;
		
		System.out.println(suma);

	}

}
