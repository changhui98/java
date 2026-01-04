package basic.access.ex;

public class MaxCounterMain {

    public static void main(String[] args) {

        MaxCounter maxCounter = new MaxCounter(2);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        int count = maxCounter.getCount();
        System.out.println(count);
    }

}
