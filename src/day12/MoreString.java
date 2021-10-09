package day12;

import java.util.Locale;
import java.util.Scanner;

public class MoreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	    /*
	     * str1.equals(str2)  ---check for equality with case sensitive
	     * str1.equalsIgnoreCase(str2)  ---check for equality with case insensitive
	     * 
	     * str1.toUpperCase()  ---> return original string with uppercase
	     * str1.toLowerCase()  ---> return original string with lowercase
	     * 
	     * 
	     * */
		
		String name1 = "Sevda";
		
		char charFirst = name1.charAt(1);
		System.out.println("First character is: " + charFirst);

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name");
		String name = scan.next();
		String lastName = scan.next();
		char chName = name.charAt(0);

		char chaLastName = lastName.charAt(0);
		String str1 = ""+chName;
		System.out.println("Your initial is: " + str1.toUpperCase() + chaLastName);
		System.out.println("Your initial is: " + name.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0));





	}

}
