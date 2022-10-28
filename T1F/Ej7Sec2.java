package es.florida.T1F;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej7Sec2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String l;
		String text="";
		File f = new File(args[0]);
		
		
		do {
			l = sc.nextLine();
			if(!l.equals("exit")) {
				text += l +"\n";
			}
			
		}while(!l.equals("exit"));
		
		if(text.length() > 0) {
			
			try {
				f.createNewFile();
				
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter (fw);
				
				bw.write(text);
				
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
