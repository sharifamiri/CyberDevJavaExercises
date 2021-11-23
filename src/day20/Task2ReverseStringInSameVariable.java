package day20;

import java.util.Scanner;

public class Task2ReverseStringInSameVariable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
//        String reverseName = "";
        for(int i = name.length()-1; i >= 0; i--){
            name = name + name.charAt(i);
        }
        System.out.println(name.substring(name.length()/2));

    }

    public static void saloh(){
        System.out.println("Saloh");
    }

}
