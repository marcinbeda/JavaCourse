package concurrency.threadsOperations.synchornizedExample;

/**
 * Created by Marcin Beda.
 */

public class SynchronizedRunnable implements Runnable {

    private SynchronizedCounter counter;

    public SynchronizedRunnable(SynchronizedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
