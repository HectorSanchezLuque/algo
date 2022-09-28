package es.florida.T1Fitxers;

import java.io.FileReader;
import java.io.IOException;

public class Ej1Sec2 {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(args[0]);
			int getc;
			while((getc=fr.read()) !=-1) {
				System.out.print((char)getc);
				Thread.sleep(100);
			}
		} catch (IOException io) {
			System.out.println("Exception: " + io);
			// TODO: handle exception
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
