package day20;

import java.util.Scanner;

public class DoWhileLoopPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		do {
			System.out.println("WELCOME");
			System.out.println("Please enter your score:");
			x = sc.nextInt();

		}while(x>100);
		
		while(x>100) {
		System.out.println("action repeated");
		}
		
		System.out.println("END");

	}

}
