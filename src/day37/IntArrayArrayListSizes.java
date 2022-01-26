package day37;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayArrayListSizes {

    public static void main(String[] args) {


        String str = "saloh";
        System.out.println(str.length());

        int [] nums = {1,2,3};
        System.out.println(nums.length);

        ArrayList<String> words = new ArrayList<String>(Arrays.asList("aa","bb"));
        System.out.println(words.size());

        words.add("cc");
        System.out.println(words);
        words.remove(1);
        System.out.println(words);
    }
}
