package day24;

public class ArraySum {

    public static void main(String[] args) {

        int[] nums = {4,3,9,2};
                   //2,3,4,9
        //nums[0]
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        System.out.println(sum);


    }
}
