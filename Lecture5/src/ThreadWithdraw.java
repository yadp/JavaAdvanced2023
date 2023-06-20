public class ThreadWithdraw extends Thread{

    private BankAccount bankAccount;
    private int count;

    public ThreadWithdraw(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        count = 0;
    }

    @Override
    public void run() {
        //TODO
        //Loop Inf
        while (true) {
            count++;
            if(bankAccount.isBlockAccount()){
                break;
            }
            //400 ms
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            double result = bankAccount.withdraw(90);

            if( result < 0 ){
                System.out.println("Trying to withdraw 90 " +
                        "Result: "+ result);
                System.out.println("Count of withdraws "+ count);
            }
            //Withdraw
            System.out.println("Withdraw 90 " +
                    "Result: "+ result);
        }


    }
}
