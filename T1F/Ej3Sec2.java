package es.florida.T1F;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej3Sec2 {

	public static void main(String[] args) {

		boolean bucle = true;		
		Scanner sc = new Scanner(System.in);
		File f = new File(args[0]);
		int c;
		try {
			FileReader read = new FileReader(f);

			try {
				int i = 0;
				while (bucle) {

					c = read.read();

					if (c == -1) {
						bucle = false;
					} else {

						if (i == 100) {
							sc.nextLine();
							i = 0;
						} else {
							System.out.print((char) c);
							i++;
						}
					}
				}
				read.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}