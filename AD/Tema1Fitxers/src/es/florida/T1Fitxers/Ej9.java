package es.florida.T1Fitxers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ej9 {

	private static void mostraInf() {

		String mensaje = "Elija una de las opciones: \n" + "1. Muestra información \n" + "2. Crear carpeta \n"
				+ "3. Crear fichero \n" + "4. Eliminar fichero/Carpeta \n" + "5. Renombrar \n" + "0. Salir";

		System.out.println(mensaje);
	}

	private static void getInformacion(File f) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println("Datos: ");
		System.out.println("Nombre: " + f.getName());
		if (f.isDirectory()) {
			System.out.println("Es un directorio");
			System.out.println("Número de elementos: " + f.listFiles().length);
			System.out.println("Espacio libre: " + f.getFreeSpace() / 1048576 + "gb");
			System.out.println("Espacio disponible: " + f.getUsableSpace() / 1048576 + "gb");
			System.out.println("Espacio total: " + f.getTotalSpace() / 1048576 + "gb");
		} else if (f.isFile()) {
			System.out.println("Es un fichero");
			System.out.println("Tamaño: " + f.getTotalSpace() / 1048576 + "gb");
		}
		System.out.println("Ruta: " + f.getPath());
		System.out.println("Última modificación: " + df.format(f.lastModified()));

		if (f.isHidden()) {
			System.out.println("Oculto: Sí");

		} else {
			System.out.println("Oculto: No");
		}

	}

	private static void crearCarpeta(File f) {
		if (f.isDirectory()) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Indica el nombre para la carpeta");
			String nombre = scan.nextLine();

			File dir = new File(f.getAbsoluteFile() + "/" + nombre);
			if (dir.mkdir()) {
				System.out.println("Directorio creado");
			} else {
				System.out.println("No se ha podido crear");
			}
			scan.close();
		}

	}

	private static void crearFichero(File f) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica nombre carpta: ");
		String nameC = sc.nextLine();

		File carp = new File(f.getAbsolutePath() + "/" + nameC);

		if (carp.mkdir()) {

			System.out.println("Carpeta creada");

		} else {
			System.out.println("La ruta no es un directorio");
		}
		return carp;
	}

	private static void eliminar(File f) {
		f.delete();
	}

	private static void renombrar(File f) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica nombre nuevo");
		String newName = sc.nextLine();
		
		File newDir = new File(f.getParent() + "/" + newName);
		
		f.renameTo(newDir);
		System.out.println("Archivo renombrado");
	}

	public static void main(String[] args) {

		File f = new File(args[0]);
		Scanner sc = new Scanner(System.in);
		String valor = "-1";

		while (!valor.equals("0")) {
			mostraInf();
			valor = sc.nextLine();

			switch (valor) {
			case "1": {
				getInformacion(f);

				break;
			}
			case "2": {
				crearCarpeta(f);
				break;
			}
			case "3": {
				crearFichero(f);
				sc.nextLine();
				sc.close();
				break;
			}
			case "4": {
				eliminar(f);
				sc.nextLine();
				sc.close();
				break;
			}
			case "5": {
				renombrar(f);
				sc.nextLine();
				sc.close();
				break;
			}
			}
		}
		sc.close();

	}

}
