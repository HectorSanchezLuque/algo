package es.florida.T1F;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej4Sec2 {

	public static void main(String[] args) {
		
		File f = new File(args[0]);
		String l;
		try {
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			try {
				while((l = br.readLine()) != null) {
					
					System.out.println(l);
				}
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