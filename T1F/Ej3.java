package es.florida.T1F;
import java.io.File;

public class Ej3 {

	public static void main(String[] args) {
		File f = new File(args[0]);

		if (f.isDirectory()) {

			String[] lista = f.list();

			for (String fitxer : lista) {

				System.out.println(fitxer);
			}
			
		} else {
			
			System.out.println("El directorio no existe");
		}

	}

}
