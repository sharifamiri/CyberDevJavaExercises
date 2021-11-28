package day23;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] abcefg) {
		// TODO Auto-generated method stub

		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int i5 = 50;

		//you have 3 students
		//1-60, 2-70, 3-80

		int s1 = 60;
		int s2 = 70;
		int s3 = 80;

		System.out.println("S1: " + s1 +" S2: " +  s2 + " S3: " +  s3);

		int[] nums = new int[3];
//		Scanner scanner = new Scanner(System.in);
		nums[0] = 60;
		nums[1] = 70;
		nums[2] = 80;
		System.out.println("ARRAY: " + Arrays.toString(nums));
		
		//we declared int array variable 
		//and we assigned and int array object
		//that has capacity of 5
		
		
		int[] numbers = new int[5];
		//System.out.println(numbers);//you can't directly print an array variable
		
		//ASSIGNING VAlue to array
		numbers[0]=10;
		numbers[1]=15;
		numbers[2]=8;
		numbers[3]=20;
		numbers[4]=3;
		
		System.out.println(numbers[0]);
		
		
	}

}
