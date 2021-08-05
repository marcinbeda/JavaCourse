package intermediate.multithreading.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marcin Beda.
 */

public class RaceConditionSynchronized {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        CounterSynchronized counterSynchronized = new CounterSynchronized();

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> counterSynchronized.increase());
        }

        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(counterSynchronized.getCount());
    }
}

class CounterSynchronized {

    private int count = 0;

    public void increase() {
        synchronized (this) {
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }
}
