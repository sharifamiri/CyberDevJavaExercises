package day21;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1");
		int numb1 = scan.nextInt();
		System.out.println("Enter number2");
		int numb2 = scan.nextInt();


		for (int i=0; i<3; i++ ){
			int result = numb1+numb2;
			System.out.println("Your result is " + result);
			if(result > 100){
				break;
			}
			System.out.println("Enter number1 again:");
			numb1 = scan.nextInt();
			System.out.println("Enter number2 again:");
			numb2 = scan.nextInt();
		}
		
		// WARM UP

		//ASK USER TWO NUMBER

		//KEEP ASKING UNTIL THE SUM OF
		//TWO NUMBERS ARE MORE THAN 100

		//PRINT THE END AFTER THE LOOP

		//OPTIONAL : 3 ATTEMPS ONLY
		
//		System.out.println("Enter two numbers");
//		//1st Way:
//		int num1=0;
//		int num2 =0;
//		int count=0;
//		do {
//			System.out.println("Enter Number1");
//			num1 = scan.nextInt();
//			System.out.println("Enter Number2");
//			num2 = scan.nextInt();
//			//if(count==3)
//			//break;
//		} while (num1+num2<=100 && ++count<=3);
			
			
	
		
		//2nd Way;

//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sum = num1+num2;
//		for (int i = 0; sum <=100; i++) {
//			num1 = scan.nextInt();
//			num2 = scan.nextInt();
//			sum+=num1+num2;
//			
//			if(i==3)
//			break;
//		}
		
		System.out.println("THE END");
		
		
	}

}
