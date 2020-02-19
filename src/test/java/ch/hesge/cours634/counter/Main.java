import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) {
        try {
            UpperLimitedPositiveCounter c = new UpperLimitedPositiveCounter(1,2);
            c.add(5);
        }catch (CounterException e){
            System.out.println(e);
        }

    }
}
