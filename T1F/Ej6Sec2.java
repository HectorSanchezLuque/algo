package es.florida.T1F;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej6Sec2 {

	public static void main(String[] args) {

		File f = new File(args[0]);
		String l;
		String ls="";
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			try {
				while( (  l = br.readLine())!= null) {
							
						ls += l + "\n";
				}
				
				br.close();
				fr.close();
				
				File cp = new File(f.getParent() + "/copy.txt");
				cp.createNewFile();
				FileWriter fw = new FileWriter(cp);
				BufferedWriter bw = new BufferedWriter(fw);	
				bw.write(ls);	
				bw.close();
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