package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int v;

    public Counter(int v) throws CounterException {
        this.v = v;
    }

    @java.lang.Override
    public void inc() throws CounterException {
        v++;
    }

    @java.lang.Override
    public void add(int step) throws CounterException {
        v+=step;
    }

    @java.lang.Override
    public int getValue() {
        return v;
    }
}
