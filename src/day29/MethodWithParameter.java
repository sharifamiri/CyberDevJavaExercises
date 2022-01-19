package day29;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {
		
		//Arrays.sort(arr);
		holdYourHorse("Anar");
		//holdYourHorse(1234); --> if does not compile if data type not match
		holdYourHorse("David");
		holdYourHorse("Fatma");
		holdYourHorse("Sumeyye");

		MethodWithParameter mvp = new MethodWithParameter();
		Scanner scan = new Scanner(System.in);
		System.out.println("What's up?");
		String name = scan.nextLine();
//		System.out.println(name);
		System.out.println(MethodWithParameter.printSentence(name,name));
//		printSentence(name, name);

	}

	public static String printSentence(String str, String str1){
		System.out.println(str1 + ": Today");
		return str1;
	}
									//parameter
	public static void holdYourHorse(String owner) {
		//String owner = "Anar";
		System.out.println(owner+ ": hold your horse");
	}

}
