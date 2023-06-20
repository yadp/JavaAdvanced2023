public class BankAccount {

    private boolean blockAccount;

    private double amount;

    public BankAccount(double amount){
        this.amount = amount;
        blockAccount = false;
    }

    public boolean isBlockAccount() {
        return blockAccount;
    }

    public void setBlockAccount(boolean blockAccount) {
        this.blockAccount = blockAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public synchronized double deposit(double money){
        if ( blockAccount == false) {
            amount += money;
            return amount;
        } else {
            return amount;
        }
    }


     public synchronized double withdraw(double money){
        if(blockAccount == false) {
            amount -= money;
            if (amount < 0) {
                blockAccount = true;
            }
            return amount;
        } else {
            return amount;
        }
     }

}
