package aourpractice;

public class Excersice1 {

    public static void main(String[] args) {
        System.out.println(solution("force"));
    }
   static String solution(String text) {
        String word = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'f' || text.charAt(i) == 'F'){
                word += "K";
            }
            word += text.charAt(i);
        }
        return word;

    }
}
