package day22;

public class TaskTargetWord {

    public static void main(String[] args) {

        String text = "Musa was a prophet of God. Musa came before prophet Isa";
                     //
        //Find how many times Musa and Isa mentioned in the text
        String target = "Musa";
        System.out.println(target.substring(0,4));
        int count = 0;
        int targLength = target.length();

        for(int i = 0; i <= text.length()-targLength; i++){
            //if you see "Musa" then make count + 1;
            String word = text.substring(i,targLength+i);
            if(word.equals(target)) count++;
        }
        System.out.println(target + " mentioned: " + count);



    }
}
