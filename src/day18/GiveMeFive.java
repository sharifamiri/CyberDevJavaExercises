package day18;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		System.out.println();
		
		while(x!=5) {
			System.out.println("GIVE ME 5");
			x=scan.nextInt();
		}
		
		System.out.println("YAY GOOD JOB");
		System.out.println("ENTER NUM");
		int num = scan.nextInt();
		while (num <= 5 && num >=2){
			if(num >= 3){
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
			num = scan.nextInt();
		}

		int count = 10;
		while (count > 0){
			System.out.println("Enter score:");
			num = scan.nextInt();
			if(num <= 5 && num >=2){
				System.out.println("Pass");
			}else{
				System.out.println("Fail");
			}
			count--;
		}

	}

}
