package project;

import java.util.Scanner;
import java.io.*;

public class main {

	public static void main(String[] args) {
		OCalculator myCalculator;
		try {
			File myFile = new File("datos.txt");
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
		        String data = myReader.nextLine() + " n";
		        System.out.println(data);
		      }
			myReader.close();
		} catch (FileNotFoundException  e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
	}

}
