package day39;

public class ReturnStatementAge {

    static String eligible;

    public static void main(String[] args) {
        System.out.println(issueDriverLicense(17));
    }

    public static String eligibility(int age){
        if (age >= 18){
            return "Eligible";
        }else{
            return "Not Eligible";
        }
    }

    public static String issueDriverLicense(int age){
        if(eligibility(age).equals("Eligible")){
            eligible = "Print";
        }else{
            eligible = "Under age. Check back when you are 18";
        }
        return eligible;
    }
}
