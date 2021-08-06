package concurrency.multithreadedCollections.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Marcin Beda.
 */

public class SellRunnable implements Runnable {

    private CountDownLatch countDownLatch;

    public SellRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        sell();
        countDownLatch.countDown();
    }

    private void sell() {
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + "is selling items");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + " sold items");
    }
}
