package day23;

import java.util.Arrays;

public class PrintingStringWLoop {

    public static void main(String[] args) {
        String [] names = {"sal","id","sharif"};
        System.out.println(names[0]);

        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
            System.out.println();
            System.out.println(Arrays.toString(names));
        }
    }
}
