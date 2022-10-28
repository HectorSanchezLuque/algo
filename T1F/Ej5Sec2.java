package es.florida.T1F;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej5Sec2 {

	public static void main(String[] args) {

		File f = new File(args[0]);
		String l;

		try {
			FileReader fr = new FileReader(f);

			BufferedReader br = new BufferedReader(fr);

			try {
			l = br.readLine();
			
			System.out.println(l);
					
			br.close();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}