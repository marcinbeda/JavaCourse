package concurrency.multithreadedCollections.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Marcin Beda.
 */

public class CyclicBarrierRunnable implements Runnable {

    private String startMessage;
    private String finishMessage;
    private long time;
    private CyclicBarrier cyclicBarrier;

    public CyclicBarrierRunnable(String startMessage, String finishMessage, long time, CyclicBarrier cyclicBarrier) {
        this.startMessage = startMessage;
        this.finishMessage = finishMessage;
        this.time = time;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        doWork();
        await();
        System.out.println(finishMessage);
    }

    private void await() {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    private void doWork() {
        System.out.println(startMessage);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
