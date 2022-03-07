package day40;

public class BankActivity2 {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.balance = 2000;
        bankAccount.accountHolder = "Saloh";

        bankAccount.add100Dolars();
        bankAccount.printInfo();
        bankAccount.withraw(200);
        bankAccount.printInfo();
    }
}
