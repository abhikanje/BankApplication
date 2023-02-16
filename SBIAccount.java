import java.util.UUID;

public class SBIAccount implements BankInterface{

    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfIntrest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //passed by bank
        this.rateOfIntrest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
        //UUID = universal unique ID it will generate no
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Paisa hi Paisa: "+amount;
    }

    @Override
    public String withdraw(int amount,String enterdPassword) {
        if(enterdPassword.equals(this.password)){
            if(balance<amount){
                return "Bhai account me paisa dalo";
            }else{
                balance -= amount;
                return "Money deducted";
            }
        }else{
            return "Nalle berozgar, password galat hai";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfIntrest*time)/100.0;
    }
}

