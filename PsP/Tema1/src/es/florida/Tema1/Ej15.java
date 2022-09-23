package es.florida.Tema1;

import java.util.Scanner;

public class Ej15 {

	public static double CalcDiam(double radio) {
		double diametro = radio * 2;
		return diametro;
	}

	public static double CalcAr(double radio) {
		double area = 3.14 * (radio * radio);
		return area;
	}
	
	public static double CalcVolEs(double radio) {
		double volumen = (4 * 3.14 * (radio * radio * radio))/3;
		return volumen;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double rad = sc.nextDouble();

		sc.close();

		System.out.println("El diametro es: " + String.format("%.3f", CalcDiam(rad)));
		System.out.println("El area es: " + String.format("%.3f", CalcAr(rad)));
		System.out.println("El volumen es: " + String.format("%.3f", CalcVolEs(rad)));

	}

}
