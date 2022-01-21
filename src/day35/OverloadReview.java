package day35;

public class OverloadReview {

    static String username = "saloh";
    static int password = 12345;

//    public static void main(String[] args) {
//        String username = "saloh";
//        int password = 12345;
//    }

    public static void login(String username){
        System.out.println(username);
    }

    public static void login(String username, int password){
        System.out.println(username + " | " + password);
    }


    public static void loginToSystem(String status){

        if(status.equals("Admin")){
            login(username);
        }else if (status.equals("Employee")){
            login(username, password);
        }
    }


}
