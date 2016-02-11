package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Application {

	/**
	 * Launch the application
	 * @param args This parameter is ignored
	 */
	private static FileInputStream fichier_wav;
	
	public static void main(String args[]) throws IOException {
		
		 System.out.println(args[0]);
		 try {
			fichier_wav = new FileInputStream(args[0]);
			System.out.println(fichier_wav.read());
			
			//lire si c'est un fichier
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
