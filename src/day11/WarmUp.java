package day11;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task 1
		Scanner s = new Scanner(System.in);

		String s2 = "a";
		int [] i = {1,3,5,Integer.parseInt(s2)};
		System.out.println(Arrays.toString(i));
		int j = 2;
		String [] str = {"saloh",Integer.toString(j)};//""+2};
		System.out.println(Arrays.toString(str));
		
		System.out.println("Please enter a number:");
		int number = s.nextInt();
		
		if (number%3==0 && number%5==0) {
			System.out.println("FIZZ BUZZ");
		}else if(number%3==0) {
			System.out.println("BUZZ");
		}else if (number%5==0 ) {
			System.out.println("FIZZ");
		}else {
			System.out.println("Invalid Number");
		}
		
	}

}
