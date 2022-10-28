package es.florida.T1F;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ej8Sec2 {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd_MM_yy HH_mm_ss");
		String na = args[0] + df.format(fecha) + ".txt";
		Scanner sc = new Scanner(System.in);
		String l;
		String text = "";
		File f = new File(na);

		do {
			l = sc.nextLine();
			if (!l.equals("exit")) {
				text += l + "\n";
			}

		} while (!l.equals("exit"));
		
		if (text.length() > 0) {
			try {
				f.createNewFile();

				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(text);
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
