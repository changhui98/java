package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        count = 0;
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("max count exceeded : " + max);
            return;
        }

        count++;
    }

    public int getCount() {
        return count;
    }
}
