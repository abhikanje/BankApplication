import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount abhiAcc = new SBIAccount(name,balance,password);
        System.out.println("Your account has been generated"+abhiAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is:"+abhiAcc.getBalance());

        //deposite
        System.out.println(abhiAcc.depositMoney(500));
        System.out.println("New balance is:"+abhiAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrwan:");
        int amount = sc.nextInt();
        System.out.println("Enter your password:");
        String enterdPassword = sc.next();

        System.out.println(abhiAcc.withdraw(amount,enterdPassword));
        System.out.println("Current balance is: "+abhiAcc.getBalance());

        //intrest
        System.out.println("Interest for 4 year on current balance:"+abhiAcc.getBalance()+" is "+abhiAcc.calculateInterest(4));
    }
}