package day30;

public class StringReverse {

    public static void main(String[] args) {

        revName("saloh");

    }

    public static String revName(String name){
        String rev = "";
        for(int i = name.length()-1; i >= 0; i--){
            rev += name.charAt(i);
        }
        return rev;
    }
}
