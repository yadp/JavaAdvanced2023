package fibbonacciExample;

public class Factorial implements Runnable{

    private final int n;
     public Factorial(int n){
         this.n=n;
     }
    @Override
    public void run() {
         Long result=1L;
        for (int i = 1; i <= n; i++) {
            result=result*i;
        }
        System.out.println("FibbonacciExample.Factorial is " + result);
    }
}
