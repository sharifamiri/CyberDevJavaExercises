package day24;

public class PrintingAtoZ {

    public static void main(String[] args) {

        for (int i = 'A'; i <='Z'; i++) {
            System.out.print((char)i + " ");
        }

        System.out.println();
        //PRINTING 26 TIMES
//        for (int i = 'A'; i <= 'Z'; i++) {
//            //for (int i = 65; i <= 91; i++) {
//            //for (int i = 1; i <= 26; i++) {
//            for (int c = 'A'; c <='Z'; c++) {
//                System.out.print((char)c + " ");
//            }
//            System.out.println();
//        }

        System.out.println();
        //Printing A-Z triangle
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int c = 'A'; c <=i; c++) {
                               //A<=B
                System.out.print((char)c + " ");
            }
            System.out.println();
        }
    }
}
