package day16;

public class WarmUp2 {

    public static void main(String[] args) {

        int num1 = 500;
        int num2 = 5;
        String text = "I pass the test";
        int product = num1 * num2;
        if((product) > 1000){
            System.out.println(text + " : " + (num1+num2));
        }else {
            System.out.println(text.replace("pass","fail") + " : " + product);
        }
    }

}
