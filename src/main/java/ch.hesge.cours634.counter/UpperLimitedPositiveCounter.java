package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private int v;
    private int max;

    public UpperLimitedPositiveCounter(int v, int max) throws CounterException{
        super(v, max);
    }
}
