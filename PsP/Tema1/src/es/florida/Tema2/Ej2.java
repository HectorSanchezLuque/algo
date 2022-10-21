package es.florida.Tema2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Ej2 {

	static void lanzador(int n1, int n2, String nom) {
		String clase ="es.florida.Tema2.Ej1";
		File ruta = new File ("C:\\Users\\hesalu\\Desktop\\PsP\\Tema1\\src\\Saves");
		File arch = new File (nom);
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
			command.add(String.valueOf(n1));
			command.add(String.valueOf(n2));
			command.add(String.valueOf(nom));
			

			ProcessBuilder builder = new ProcessBuilder(command);
			builder.inheritIO().start();
			
			if (builder.directory(ruta) != null){
			}
			if (builder.redirectOutput(arch) != null) {
			}
			Process p = builder.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ej2.lanzador(10, 25, "res1.txt");
		Ej2.lanzador(60, 80, "res2.txt");
		

	}

}
