package concurrency.multithreadedCollections.countDownLatch;

import java.util.concurrent.CountDownLatch;


public class SleepRunnable implements Runnable {

    private CountDownLatch countDownLatch;

    public SleepRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        sleep();
        countDownLatch.countDown();
    }

    private void sleep() {
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + "is sleeping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Character from the thread: " + Thread.currentThread().getName() + " wakes up");
    }
}
