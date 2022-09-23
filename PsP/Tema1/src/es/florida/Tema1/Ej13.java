package es.florida.Tema1;

import java.util.Scanner;

public class Ej13 {

	static double gToF(double grados) {
		double farenh = (grados * 1.8) + 32;
		return farenh;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double grad = sc.nextDouble();
		
		
		System.out.println(String.format("%.1f", gToF(grad)));
		sc.close();
	}

}
