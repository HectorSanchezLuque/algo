package es.florida.Tema1;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fecha = sc.next();
		int num = 1 + (int) (Math.random() * 100);
		
		System.out.println("Su suerte es: " + num);
	}

}
