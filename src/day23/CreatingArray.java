package day23;

import java.util.Arrays;

public class CreatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbs = new int[2];
		numbs[1] = 5;
		System.out.println("NUMBS: " + Arrays.toString( numbs));
		//once array is created with a given size
		//it can not be changed
		int[] numbers = {5,4};
		System.out.println("NUMBERS: " + Arrays.toString( numbers));
		//2nd way to create an array with predefined items

		int[] digits = new int[]{2,6,7};
		System.out.println("DIGITS: " + Arrays.toString(digits));
		//dataType [] variableName = new dataType []{item1, items...}
		
		//int []nums = new int[] {1,3,4,5,8,9,0,4,-2};
		int []nums;
		      nums= new int[] {1,3,4,5,8,9,0,4,-2};
		
		//getting the size an array
		int size = nums.length;
		System.out.println(size);

		nums[0]=100;
		
		System.out.println(nums[0]);
		System.out.println(nums[size-1]); //to get last one
		
		//Final way to create an array
		//declaring and assigning value like this
		//can only happen in one statement
		//this will not compile
		//int[] nums3;
		//nums3= {1,2,3,4,5,6,7,8,89,9,19,92,82,18};
		int[] nums2 = {1,2,3,4,5,6,7,8,89,9,19,92,82,18};
		
		System.out.println(nums2.length);
	
	}

}
