package proj3;

import java.util.Scanner;

public class Test {
	
	
	
	
	
	
	
//ctrl shift o sve da improtuje
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		
		System.out.println(userInput);

		String[] parts = userInput.split(" ");
		
		String operation = parts[1];
		Double prvibroj = Double.parseDouble(parts[0]);
		Double drugibroj = Double.parseDouble(parts[2]);
		Double rezultat = 0.00;
		
		switch(operation) {
		case "+":
			rezultat = prvibroj + drugibroj;
			break;
		
		case "-":
			rezultat = prvibroj + drugibroj;
			break;
		case "/":
			rezultat = prvibroj /drugibroj;
			break;
		default:
		
		
		}
		System.out.println(rezultat);
	}

}
