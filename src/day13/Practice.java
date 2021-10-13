package day13;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter:");
        String name = scanner.next();
        //Please enter the last 3 letters
        String sub = name.substring(0,3);
        System.out.println(sub);
        int length = name.length();
        System.out.println(length);

        String sub3 = name.substring(length-1,length);
        System.out.println(sub3);

        String sub4 = name.substring(1);
        System.out.println(sub4);
        //idris
        //01234
        //length = 5
    }
}
