package es.florida.Tema2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej8 {

	static void lanzador(Matrix m) {
		String clase = "es.florida.Tema2.Matrix";
		try {
			String javaHome = System.getProperty("java.home");
			String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
			String classpath = System.getProperty("java.class.path");
			String className = clase;

			List<String> command = new ArrayList<>();
			command.add(javaBin);
			command.add("-cp");
			command.add(classpath);
			command.add(className);
			command.add(String.valueOf(m.getVelocidadNEO()));
			command.add(String.valueOf(m.getPosicionNEO()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static List<Matrix> cargarDatos(File f) throws FileNotFoundException {
		List<Matrix> l = new ArrayList<Matrix>();
		Matrix m = new Matrix();
		FileReader file = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(file);
		String line = "";
		String[] lines;
		try {
			while((line = br.readLine())!= null) {
				lines = line.split(",");
				m.setNombreNeo(lines[0]);
				m.setPosicionNEO(Integer.parseInt(lines[1]));
				m.setVelocidadNEO(Integer.parseInt(lines[2]));
				l.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return l;
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\hesalu\\Desktop\\PsP\\Tema1\\src\\Saves\\miniproyecto.txt");
		List<Matrix> lista = new ArrayList<Matrix>();
		lista = cargarDatos(f);
		for (int i = 0; i < lista.size(); i++) {
			Matrix m = lista[i];
			lanzador(lista[i]);
		}
	}
}
