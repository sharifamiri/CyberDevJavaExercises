package aourpractice;

import java.util.Scanner;

public class Day23ReverseNumber {

    public static void main(String[] args) {
        int x = 123;
        //y = 321

        int y = 0;
        while (x > 0){
            //y *= 10;
            //y += x % 10;
            y =(x % 10) + y * 10;
            x /= 10;
        }
        x = y;
        System.out.println(x);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int z1 = 0;

        for (int i = 0; number >0; number=number/10){
            int x1 = number % 10;
            z1 = x1 + z1 * 10;
            //z1=y1;
        }
        System.out.println(z1);


        /*
        String num = "" + x;
        System.out.println(num);

        for (int i = num.length()-1; i>=0; i--){
            num += num.charAt(i);
        }
        num = num.substring(num.length()/2);
        System.out.println(num);
        int temp = 0;
        for (int i = 0; i<num.length(); i++){
            temp *=10;
            temp += num.charAt(i) - '0';
        }
        System.out.println(temp); //321
        */
    }
}
