package intermediate.multithreading.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> counter.increase());
        }

        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(counter.getCount());
    }
}

class Counter {

    private int count = 0;

    public void increase() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}