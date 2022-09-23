package es.florida.Tema1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if (num1 > num2) {
			System.out.println(num1 + " es el número mayor");
			System.out.println(num2 + " es el número menor");
		} else {
			
			System.out.println(num2 + " es el número mayor");
			System.out.println(num1 + " es el número menor");
		}

	}

}
