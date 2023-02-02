package project;

import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		OCalculator myCalculator = new OCalculator();
		System.out.println("+-----------------------------+");
		System.out.println("| Bienvenido a su Calculadora |");
		System.out.println("+-----------------------------+");
		try {
			String data = "";
			File myFile = new File("datos.txt");
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
		        data = myReader.nextLine();
		      }
			myReader.close();
			System.out.println();
			System.out.println("Su expresion posfix es:");
			System.out.println(data);
			ArrayList<String> ListOfCharacters = new ArrayList<String>(Arrays.asList(data.split(" ")));
			myCalculator.setListOfCharacters(ListOfCharacters);
			String r = myCalculator.calculate();
			System.out.println(r);
		} catch (FileNotFoundException  e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
	}

}
