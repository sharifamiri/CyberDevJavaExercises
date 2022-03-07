package aourpractice;

public class ReverseNumPalindrome {

    public static void main(String[] args) {

//        System.out.println(palindrome(121));
        System.out.println(firstAndLastDigitSum(7896));
    }

    //12389
    //

    static boolean palindrome(int num){//121
        int rev = 0;
        int temp = num;
        while (num > 0){//3
            rev *= 10;
            rev = rev + num % 10;
            num = num / 10;
        }

        return temp == rev;
    }

    static int firstAndLastDigitSum(int num){
        int lastDigit = num % 10;
        int firstDigit = 0;
        while (num > 0){
            firstDigit = num % 10;
            num = num / 10;
        }

        System.out.println(firstDigit);
        return firstDigit + lastDigit;
    }
}
