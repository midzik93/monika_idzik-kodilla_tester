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

    public int getBalance(){
        return balance;
    }
}
