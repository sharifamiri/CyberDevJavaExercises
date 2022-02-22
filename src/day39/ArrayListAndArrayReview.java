package day39;

import java.util.*;

public class ArrayListAndArrayReview {



    public static void main(String[] args) {
        
        //Array
        //has a fixed size. you can't change it
        //this one works faster
        //Array take both primitives and wrapper obj

        int [] num = {1,2,3};
        num[1] = 4;
        System.out.println(Arrays.toString(num));
        System.out.println(num[1]);

        int[] num1 = new int[2]; //2 is a size
        System.out.println(Arrays.toString(num1));
        num1[0] = 3;
        num1[1] = 4;
        System.out.println(Arrays.toString(num1));
        Integer[] num2 = {4,2};

        System.out.println("---------------------");
        //ArrayList
        //you can change it
        //ArrayList only takes wrapper obj
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,5));
        arr.add(3);
        arr.add(2);
        System.out.println(arr);
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("camry","corolla"));
        System.out.println(cars);
        System.out.println(cars.get(1));
        if(cars.isEmpty()){
            System.out.println("No data");
        }else {
            System.out.println("My best car is: " + cars.get(0));
        }
        //another way to create ArrayList
        List<Double> doubles = new ArrayList<>();

        Collections.sort(arr);
        System.out.println(arr);

        List<Integer> ints = new Stack<>();




    }
}
