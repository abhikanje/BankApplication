public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount, String enterdPassword);
    double calculateInterest(int time);
}
