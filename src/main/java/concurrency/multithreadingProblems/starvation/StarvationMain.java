package concurrency.multithreadingProblems.starvation;

import java.util.Random;

/**
 * Created by Marcin Beda.
 */

public class StarvationMain {

    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        Thread thread1 = new Thread(new StarvationRunnable((commonResource)), "max priority thread");
        Thread thread2 = new Thread(new StarvationRunnable((commonResource)), "thread with priority 2");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(2);

        Random random = new Random();

        thread1.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new StarvationRunnable(commonResource), "thread " + i);
            thread.setPriority(random.nextInt(10) + 1);
            thread.start();
        }
    }
}
