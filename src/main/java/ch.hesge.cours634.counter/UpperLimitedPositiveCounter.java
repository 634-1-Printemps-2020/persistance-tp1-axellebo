package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private int max;

    public UpperLimitedPositiveCounter(int v, int max) throws CounterException{
        super(v);
        if(v<0 || v > max){throw new CounterException("La valeur est soit plus petite que 0 soit plus grande que la valeur max");}
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        if(super.getValue()+1>max){throw new CounterException("La valeur dépasse le max");}
        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        if(super.getValue()+step > max || super.getValue()+step < 0){throw new CounterException("La valeur est soit plus petite que 0 soit plus grande que la valeur max");}
        super.add(step);
    }
}
