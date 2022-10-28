package es.florida.T1F;

import java.io.File;
import java.io.FilenameFilter;

public class Ej7 {

	public static void main(String[] args) {

		File f = new File(args[0]);

		String[] lista = f.list();
		try {
			lista = f.list(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					for (int i = 1; i < args.length; i++) {
						if (name.endsWith(args[i])) {
							return name.endsWith(args[i]);
						}
					}
					return false;
				}

			}

			);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			lista = f.list();
		}
		for (String objeto : lista) {
			System.out.println(objeto);

		}

	}

}
