package es.florida.T1F;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modelo {
	
	
	public String leerFich (File f) {
		boolean bucle = true;
		int c;
		String texto = "";
		try {
			FileReader read = new FileReader(f);

			try {
				while (bucle) {
					c = read.read();
					if (c == -1) {
						bucle = false;
					} else {
						texto += c;
					}
				}
				read.close();
				return texto;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return "";
	}
	
	public String contar(String texto, String palabra) {
		String numString = "";
		int contador = 0;
		
		String[] listaPalabras = texto.split(" ");
		
		for (String s : listaPalabras) {
			if (s.equals(palabra)) {
				contador += 1;
			}
		}
		
		numString = Integer.toString(contador);
		
		return numString;
	}
	
	public String reemText(String text, String bWord, String rWord, String dir) {

		String[] list = text.split(" ");
		String newText = "";

		for (int i = 0; i < list.length; i++) {

			if (list[i].equals(bWord)) {
				list[i] = rWord;
			}

			newText += list[i] + " ";
		}
		File fdir = new File(dir);

		writeText(fdir, newText);

		return newText;
	}

	void writeText(File f, String text) {

		String dir;
		try {
			dir = f.getParent();

			dir += "/" + "copia.txt";

			f = new File(dir);

			f.createNewFile();

			FileWriter fw = new FileWriter(f);

			BufferedWriter bfw = new BufferedWriter(fw);

			bfw.write(text);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
