package counter;

public class Counter {

    int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    //synchronized
    public int addCount(){
        count++;
        System.out.println(count);

        return count;
    }
}
