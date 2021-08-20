package intermediate.multithreading.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class RaceConditionAtomic {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        CounterAtomic counterAtomic = new CounterAtomic();

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> counterAtomic.increase());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(counterAtomic.getCount());
    }
}

class CounterAtomic {

    private AtomicInteger count = new AtomicInteger(0);

    public void increase() {

        count.getAndIncrement();
    }

    public int getCount() {
        return count.get();
    }
}
