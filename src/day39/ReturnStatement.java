package day39;

public class ReturnStatement {

    public static void main(String[] args) {
//        printStr();
        String name = "Saloh";
        String names = printStr();
//        System.out.println(printStr());
//        System.out.println(names);
        printNum();
    }

    public static String printStr(){
        System.out.println("idris");
        return "saloh";
    }
    public static void printNum(){
        System.out.println(123);
    }
}
