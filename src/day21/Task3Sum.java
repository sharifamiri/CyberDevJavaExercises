package day21;

import java.util.Scanner;

public class Task3Sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter y num1");
        int number1 = scan.nextInt();
        System.out.println("Enter y num2");
        int number2= scan.nextInt();


        for (int i = 0; i <3; i++ ){
            int sum = number1+number2;
            if (sum >= 100){
                break;
            }
            System.out.println("Enter y num1 again");
            number1= scan.nextInt();
            System.out.println("Enter y num2 again");
            number2= scan.nextInt();
        }
    }
}
