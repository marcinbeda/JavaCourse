package concurrency.multithreadedCollections.countDownLatch;

import java.util.concurrent.CountDownLatch;


public class HuntRunnable implements Runnable {

    private CountDownLatch countDownLatch;

    public HuntRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        hunt();
        countDownLatch.countDown();
    }

    private void hunt() {
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + "is hunting");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + " comes back from the hunt");
    }
}
