package es.florida.Tema1;

import java.util.Iterator;

public class Ej12 {

	public static void main(String[] args) {
		
		int aprobado = 0;
		int suspendido = 0;
		int notable = 0;
		int sobresaliente = 0;
		int mHonor = 0;
		
		
		for (int i = 0; i < 10; i++) {
			int num = 1 + (int) (Math.random() * 10);
			System.out.println(num);
			if (num < 5) {
				suspendido++;
			} else if (num == 5 || num < 7) {
				aprobado++;
			} else if (num == 7 || num < 8) {
				notable++;
			} else if(num == 8 || num < 10) {
				sobresaliente++;
			} else if (num == 10) {
				mHonor++;
			}
			
		}
		System.out.println("Han suspendido: " + suspendido + "\n"
				+ "Han aprobado: " + aprobado + "\n"
						+ "Han sacado un notable: " + notable + "\n"
								+ "Han sacado un sobresaliente: " + sobresaliente + "\n"
								+ "Han sacado una matrícula de honor: " + mHonor);
	}

}
