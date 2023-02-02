package project;
import java.util.*;
import java.lang.*;

public class OCalculator implements ICalculator, IStack{
	private ArrayList<Float> listOfNumbers;
	private ArrayList<String> listOfCharacters;
	
	public OCalculator(ArrayList<String> a) {
		listOfNumbers = new ArrayList<Float>();
		listOfCharacters = a;
	}

	@Override
	public Object Pop() {
		float a = listOfNumbers.get(listOfNumbers.size()-1);
		listOfNumbers.remove(listOfNumbers.size()-1);
		return a;
	}

	@Override
	public void Push(Object item) {
		float number = Float.valueOf((String) item);
		listOfNumbers.add(number);		
	}

	@Override
	public Object Peek() {
		return listOfNumbers.get(listOfNumbers.size()-1);
	}

	@Override
	public int Size() {
		return listOfNumbers.size()-1;
	}

	@Override
	public float Add(float number1, float number2) {
		float r = number1 + number2;
		return r;
	}

	@Override
	public float Substraction(float number1, float number2) {
		float r = number1 - number2;
		return r;
	}

	@Override
	public float Multiply(float number1, float number2) {
		float r = number1 * number2;
		return r;
	}

	@Override
	public float Divition(float number1, float number2) {
		float r = number1 / number2;
		return r;
	}

	@Override
	public char getNextInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String calculate() {
		int pos = 0;
		String r = "";
		while(pos < listOfCharacters.size()) {
			if(listOfCharacters.get(pos)=="+") {
				float b = (float) Pop();
				float a = (float) Pop();
				Push(Add(a, b));
			}
			else if(listOfCharacters.get(pos)=="-") {
				float b = (float) Pop();
				float a = (float) Pop();
				Push(Substraction(a, b));
			}
			else if(listOfCharacters.get(pos)=="*") {
				float b = (float) Pop();
				float a = (float) Pop();
				Push(Multiply(a, b));
			}
			else if(listOfCharacters.get(pos)=="/") {
				float b = (float) Pop();
				float a = (float) Pop();
				Push(Divition(a, b));
			}
			else if(Character.isDigit(listOfCharacters.get(pos).charAt(0))){
				Push(listOfCharacters.get(pos));
			}
			else {
				r = "Se ingreso un objeto incorrecto"; 
				break;
			}
		}
		if(r=="") {
			if(Size() < 1) {
				r = "Faltaron " + (Size()-1) + "operadores";
			}
			else {
				r = "La respuesta es " + listOfNumbers.get(0);
			}
		}
		return r;
	}
	
}
