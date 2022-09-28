package es.florida.T1Fitxers;

import java.io.File;

public class Ej5 {

	public static void main(String[] args) {

		File f = new File(args[0]);
		
		String[] lista = f.list();
		
		for (String objeto : lista) {
			
			if(objeto.contains(args[1])) {
			System.out.println(objeto);
			
			}
		}

	}

}
