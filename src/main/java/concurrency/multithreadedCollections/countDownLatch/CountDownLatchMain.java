package concurrency.multithreadedCollections.countDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CountDownLatchMain {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);

        List<Runnable> tasks = new ArrayList<>();
        tasks.add(new HuntRunnable(countDownLatch));
        tasks.add(new SellRunnable(countDownLatch));
        tasks.add(new SleepRunnable(countDownLatch));

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (Runnable task : tasks) {
            service.execute(task);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Team is ready for mission");
    }
}
