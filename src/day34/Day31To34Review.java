package day34;

public class Day31To34Review {

    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 33;
        int sum = num1 + num2;
        System.out.println(sum);
        Add(num1,num2);

        //---------------------
        int sum2 = Add2(num1,num2);
        System.out.println(sum2);

        //---------------------
        int [] arr = {1,2,3};
        Add3(arr);

        //---------------------
        System.out.println(maxNum(num1,num2));
        System.out.println(maxNum2(100,num2));
    }

    public static void Add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int Add2(int num1, int num2){
        return num1 + num2;
    }

    public static void Add3(int [] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }

    public static boolean maxNum(int num1, int num2){
        boolean status = false;
        if(num1 > num2) status = true;
        else status = false;

        return status;
    }

    public static boolean maxNum2(int num1, int num2){
        if(num1 > num2) return true;
        else return false;
    }
}
