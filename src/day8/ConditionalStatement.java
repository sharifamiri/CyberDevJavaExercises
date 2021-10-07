package day8;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int score = 59;
		
		//System.out.println("current score is " + score);
		
		//if(//put some boolean expression here) {
		//do some action if its true
		//}else { 
		//do something else if it is false}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();

		if(age>65){
			System.out.println("You can go to adult school");
		}else if(age >= 18){
			System.out.println("You are eligible, go ahead and register");
		}else {
			System.out.println("You are not eligible");
		}
		
		
		//Task1
		
		Scanner input = new Scanner(System.in);

		System.out.println("Eneter your score");
		int score = input.nextInt();

		System.out.println("Your current score is " + score);
		if(score>60) {
			System.out.println("You shall pass!");
		}else {
			System.out.println("You shall not pass!");
		}
		
		
				
		
	}

}
