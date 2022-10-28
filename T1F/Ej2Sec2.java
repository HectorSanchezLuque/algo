package es.florida.T1F;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2Sec2 {

	public static void main(String[] args) {

		boolean bucle = true;
		File f = new File(args[0]);
		int c;

		try {
			FileReader read = new FileReader(f);

			try {
				while (bucle) {

					c = read.read();

					if (c == -1) {
						bucle = false;
					} else {
						System.out.print((char) c);
					}
					try {
						Thread.sleep(Integer.parseInt(args[1]));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}