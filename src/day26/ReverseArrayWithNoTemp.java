package day26;

import java.util.Arrays;

public class ReverseArrayWithNoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse this array so the value of numbers array 
		//will be in reverse order
		
		//If EVEN number OR ODD number
		int [] nums = {11,2,39,4,4,15};
		System.out.println(Arrays.toString(nums));
		
		int count = nums.length;
		int lastIndex = count-1;

		int x = 5;
		int y = 10;
		//x=10, y=5
		x = x + y; //15
		y = x - y; //15-10=5
		x = x - y; //15-5=10
		System.out.println(x + " and " + y);
		for (int i = 0; i < nums.length/2; i++){
			nums[i] = nums[i] + nums[nums.length-i-1];
			nums[nums.length-i-1] = nums[i] - nums[nums.length-i-1];
			nums[i] = nums[i] - nums[nums.length-i-1];
		}
		System.out.println("Nums: " + Arrays.toString(nums));
		



		for (int i = 0; i < count/2; i++) {
			
			nums[i] = nums[i] + nums[lastIndex-i];
			nums[lastIndex-i] = nums[i] - nums[lastIndex-i];
			nums[i] = nums[i] - nums[lastIndex-i];
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
