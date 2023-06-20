public class ThreadDeposit extends Thread{

    private BankAccount bankAccount;

    public ThreadDeposit(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        //TODO
        while (true){
            if(bankAccount.isBlockAccount()){
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Deposit 100 " +
                    "Result:"+ bankAccount.deposit(100));


        }
    }
}
