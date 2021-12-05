package aourpractice;

import java.util.Arrays;

public class Day26ReverseArray {

    public static void main(String[] args) {


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

        //3rd Way
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
    }
}
