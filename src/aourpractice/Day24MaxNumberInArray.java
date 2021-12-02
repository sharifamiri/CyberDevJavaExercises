package aourpractice;

public class Day24MaxNumberInArray {

    public static void main(String[] args) {

        int [] nums = {25,76,45,14,199};
        //find max number
        int max = nums[0]; //25
        for (int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                System.out.println(max);
            }
        }
        System.out.println(max);
    }
}
