package day11;

import java.util.Scanner;

public class CarDealership {

    public static void main(String[] args) {

        /*
        car dealer app
        ask; age, salary, type of car
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");

        int priceOfCar = 20000;
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("You are ELIGIBLE for a car");
            System.out.println("How much do you have cash$$$$?");
            int cash = scan.nextInt();
            if(cash >= priceOfCar){
                System.out.println("You have enough to buy a car");
            }else{
                System.out.println("You need " + (priceOfCar - cash) + " dollars");
            }
        }else{
            System.out.println("You are NOT ELIGIBLE for a car");
        }




//        System.out.println(eligibility);

    }
}
