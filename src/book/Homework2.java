package book;

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String salohWord = "buy house";
        System.out.println("Please enter result:");
        String result = scanner.nextLine();
        int saloh$;

        if (result.equals(salohWord)) {
            saloh$ = 2000;
            System.out.println("Saloh wins");
        } else {
            System.out.println("Saloh gets fuck");
            saloh$ = -100;
        }

        System.out.println("total: " + saloh$);


    }
}
