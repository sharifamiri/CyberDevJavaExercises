package day22;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);

		System.out.println("Enter number:");
		 int num = scan.nextInt();
		 for (int i = 0; i <= num; i++){
			 System.out.println("My i is: " + i + " | and my number is: " + num);
			 num = num/2;
		 }











		 int inhabitants = scan.nextInt();
		for (int i = 0; inhabitants>0; i++) {
		
			System.out.println("Day " + i + " [" + inhabitants + "]");
			inhabitants/=2;
			
		}
		System.out.println("---- EXTINCT ----");
	}

}
