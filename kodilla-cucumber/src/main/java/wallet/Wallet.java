package wallet;

public class Wallet {

    private int balance=0;
    public Wallet(){

    }
    public void deposit(Integer money) {
        if (money != null) {
            this.balance += money;
        }
    }
    public boolean debit(int money) {
        if (balance >= money) {
            this.balance -= money;
            return true;
        } else {
            return false;
        }
    }
    public int getBalance(){
        return balance;
    }
}
