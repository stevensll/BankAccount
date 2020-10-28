public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int ID, String pass){
        balance = 0;
        accountID = ID;
        password = pass;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setPassword(String newPass){
        password = newPass;
    }
    public boolean deposit(double amount){
        if(amount >=0) {
        balance+=amount;
        return true;
        } else return false;
    }
    public boolean withdraw(double amount) {
        if(amount <= balance && amount >= 0) {
            balance-=amount;
            return true;
        } else return false;
    }
    public String toString() {
        return String.valueOf(accountID) + "\t" + String.valueOf(balance);
    }
}
