package es.florida.T1F;
import java.io.File;

public class Ej2 {

	public static void main(String[] args) {

		File f = new File(args[0]);

			String[] lista = f.list();

			for (String fitxer : lista) {

				System.out.println(fitxer);
			}

	}

}
