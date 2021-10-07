package day11;

import java.util.Scanner;

public class TrenaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Any ternary operator can be turned into if else statement

		//used for conditionally assigning a value


		int x = 100;
		String word = "";
		if(x > 100){
//			word = "Big";
			x=101;
		}else {
			word = "Small";
		}
		System.out.println(word);

		String word1 = (x>100)?"Big":(x<0)?"Negative":"Small";
		System.out.println(word1);
		
		int score = 98;
		String abc = "";
		
//		if (score>75)
//			abc = "pass";
//			else
//			abc = "fail";
		
		abc = (score>75) ? "pass" : "fail";
		System.out.println(abc);
		
		//Task 3
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		double price = s.nextDouble();
		
		String label;
		
		if(price>100) {
			label = "expensive";
			
		}else if(price>90) {
			label = "moderate";
		}else {
			label = "cheap";
		}
		
		label = (price>100) ? "expensive" : (price>90) ? "moderate" : "cheap";
		
		System.out.println(label);
		
		String label2 =(price<=100 && price>90) ? "moderate" : "cheapOrExp" ;
		
		
	}

}
