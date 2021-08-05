package concurrency.threadsOperations.synchornizedExample;

/**
 * Created by Marcin Beda.
 */

public class SynchronizedCounter {

    private static int counter;

    public synchronized static void increment() {
        setCounter(getCounter() + 1);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int value) {
        counter = value;
    }
}
