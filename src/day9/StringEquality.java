package day9;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//boolean b = (name == "Sharif");
		
		// we use method from String class called "equals"
		
		//boolean b = name.equals("Sharif");
		
		
		//System.out.println(b);		
		
		//TASK2
		
		Scanner s = new Scanner(System.in);
		
		
		String name = "Sharif";
		String expectedName = "Sharif";

		String str = "java";
		boolean bln = str.toUpperCase().equals("java");
//		System.out.println(nameEqual);
		
		System.out.println("Enter your name");
		name = s.next();
		boolean nameEqual = name.equals(expectedName);
		if(nameEqual)
		//if(name.equals("Sharif"))
			System.out.println("That's my name");
		else
			System.out.println("Not my name");
		
		
		
	}

}
