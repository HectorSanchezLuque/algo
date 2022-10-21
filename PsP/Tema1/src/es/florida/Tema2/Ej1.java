package es.florida.Tema2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

class Ej1 {

	int sumar(int n1, int n2) {
		int resultado = 0;
		for (int i = n1; i <= n2; i++) {
			resultado += +i;
		}
		return resultado;
	}

	public static void main(String[] args) throws IOException {

		Ej1 act1 = new Ej1();
		File f = new File("C:\\Users\\hesalu\\Desktop\\PsP\\Tema1\\src\\Saves\\" + args[2]);
		FileWriter fw;
		try {
			fw = new FileWriter(f.getAbsolutePath());

			BufferedWriter buffWrite = new BufferedWriter(fw);

			buffWrite.write(String.valueOf(act1.sumar(Integer.parseInt(args[0]), Integer.parseInt(args[1]))));

			buffWrite.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
