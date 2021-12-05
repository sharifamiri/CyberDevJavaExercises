package day26;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse this array so the value of numbers array 
		//will be in reverse order
		
		//If EVEN number OR ODD number
		int [] nums = {11,2,39,4,4,15};
		System.out.println(Arrays.toString(nums));
		
		int count = nums.length;
		int lastIndex = count-1;

//		int [] rev = new int[nums.length];
//		for (int i = 0; i < nums.length; i++){
//			rev[i] = nums[nums.length-i-1];
//		}
//		System.out.println("Rev: " + Arrays.toString(rev));

		for(int i = 0; i < nums.length/2; i++){
			int tem = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-i-1] = tem;
		}
		System.out.println("Nums: " + Arrays.toString(nums));





		for (int i = 0; i < count/2; i++) {
			int temp = nums[i];
			nums[i] = nums[lastIndex-i];
			nums[lastIndex-i] = temp;
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
