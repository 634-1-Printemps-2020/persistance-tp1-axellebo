import ch.hesge.cours634.counter.Counter;
import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) {
        try {
            Counter c1 = new Counter(5);
            Counter c2 = new Counter(-3);
            UpperLimitedPositiveCounter c3 = new UpperLimitedPositiveCounter(1,2);
            UpperLimitedPositiveCounter c4 = new UpperLimitedPositiveCounter(9, 6);
            c1.inc();
            c1.add(-8);
            System.out.println(c1.getValue());
            c2.inc();
            c2.add(-6);
            System.out.println(c2.getValue());
            c3.inc();
            c3.add(-10);
            System.out.println(c3.getValue());
            c4.inc();
            c4.add(5);
            System.out.println(c4.getValue());
        }catch (CounterException e){
            System.out.println(e);
        }

    }
}
