package day19;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scan = new Scanner(System.in);

	    //1st WAY;
//	    System.out.println("Please enter a sentence");
//	    String sentence = scan.nextLine();
//	   
//	    while(!sentence.contains("java")) {
//	    	System.out.println("Please enter a sentence");
//		    sentence = scan.nextLine();
//	    }
	    //2nd Way:
	    String sentence = "";
	    int numOfSt = 4;
	    while(!sentence.toUpperCase().contains("JAVA") && numOfSt>=0) {
	    //while(sentence.toUpperCase().contains("JAVA")==false) {
	    	System.out.println("Please enter a sentence");
		    sentence = scan.nextLine();
//		    if (numOfSt == 0){
//		    	break;
//			}
		    numOfSt--;
	    }
	    System.out.println("YOUR SENTENCE CONTAINS \"JAVA\"");
		
		
	}

}
