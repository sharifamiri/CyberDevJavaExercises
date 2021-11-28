package day23;

import java.util.Arrays;

public class ArrayLength {

    public static void main(String[] args) {

        String str = "idris";
        System.out.println(str.length());

        int [] nums = {4,5,6,7,8,9};
        //length will specify how many items are in array
        System.out.println("Size is: " + nums.length);

        String[] names = {"idris","saloh","shar", "jak"};
        System.out.println("Names are: " + Arrays.toString(names));
        System.out.println(names);
    }
}
