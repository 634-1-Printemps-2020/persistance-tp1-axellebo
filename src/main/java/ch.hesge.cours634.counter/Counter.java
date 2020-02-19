package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int v;
    private int max;

    public Counter(int v, int max) throws CounterException {
        if(v<0 || v > max){throw new CounterException("La valeur est soit plus petite que 0 soit plus grande que la valeur max");}
        this.v = v;
        this.max = max;
    }

    @java.lang.Override
    public void inc() throws CounterException {
        if ((v+1)>max){
            throw new CounterException("Le counter à atteint la valeur maximum");
        }
        v++;
    }

    @java.lang.Override
    public void add(int step) throws CounterException {
        if((v+step)>max){throw new CounterException("Vous avez dépassé la valeur max du counter");}
        v+=step;
    }

    @java.lang.Override
    public int getValue() {
        return v;
    }
}
