package es.florida.T1F;

import java.io.File;

public class Ej4 {

	public static void main(String[] args) {
		
		File f = new File(args[0]);
		
		if (f.exists()) {
			
			System.out.println("El directorio existe");
			
		} else {
			System.out.println("El directorio no existe");
		}

	}

}
