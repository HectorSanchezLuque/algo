package es.florida.T1F;

import java.io.File;
import java.io.IOException;

public class Ej8 {
	
	   private static String getExtension(String fileName) {
		      if (fileName == null) {
		         return null;
		      }
		      int lastDotIndex = fileName.lastIndexOf('.');
		      return (lastDotIndex == -1) ? 
		            "" : fileName.substring(lastDotIndex + 1).toLowerCase();
		   }


	public static void main(String[] args) {

		File f = new File(args[0]);

		try {
			if (f.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("Creando copia");
				String extension = getExtension(f.toString());
				String nombre = "Copia." + extension;
				File f2 = new File(nombre);
				f2.createNewFile();
				System.out.println("Borrando copia");
				f2.delete();
				
				
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
