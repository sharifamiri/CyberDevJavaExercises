package aourpractice;

import java.util.Scanner;

public class Day23PrimeNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();

        //7 - isPrime
        //4 - notPrime
        //50 --3,5,,,,,47
        //if divisor 2 - notPrime
        //2 and 3 - isPrime
        String prime = "isPrime";
//        if(num == 2) prime = "isPrime";
//        if(num == 3) prime = "isPrime";
        if (num <= 1) {
            prime = "Either Equal to 1 or Invalid Number";
        }else {
            if (num % 2 == 0 && num != 2) prime = "notPrime";
            if (num % 3 == 0 && num != 3) prime = "notPrime";
        }
        System.out.println(prime);


    }
}
