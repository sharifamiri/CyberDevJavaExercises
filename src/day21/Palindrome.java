package day21;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Palindrome Word");
        String str = scn.next();

        String palindrome ="";
        for (int i = str.length()-1; i>=0; i--) {
            palindrome+=str.charAt(i);
        }
        if (str.equals(palindrome)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        //civic
        //aba
        //anna
        String word = "ciic";
        String result = "";
        for(int i = 0, j = word.length()-1; i < word.length()/2; i++, j--){
            if(word.charAt(i) == word.charAt(j)){
                result = "True";
            }else {
                result = "False";
                break;
            }
        }
        System.out.println(result);
    }
}
