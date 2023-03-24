import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    public static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int idEmployee;

    public Counter() {
        idEmployee = COUNTER.getAndIncrement();
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "idEmployee=" + idEmployee +
                '}';
    }
}
