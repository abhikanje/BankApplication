import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private String name;
    private String acccountNumber;
    private int balance;
    private String password;
    private double rateOfInterest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(String acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public HDFCAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //it is given by bank
        this.rateOfInterest = 6.6;
        //to get the unique account number we use uuid
        this.acccountNumber = String.valueOf(UUID.randomUUID());
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "The amount is: "+amount;
    }

    @Override
    public String withdraw(int amount, String enterdPassword) {
        if(enterdPassword.equals(password)){
            if(balance<amount){
                return "You have insufficient Balance";
            }else{
                balance -= amount;
                return "The amount is Withdrawn";
            }
        }else{
            return "The password enterd is wrong";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
