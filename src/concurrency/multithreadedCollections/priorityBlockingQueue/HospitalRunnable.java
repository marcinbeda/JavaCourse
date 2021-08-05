package concurrency.multithreadedCollections.priorityBlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Marcin Beda.
 */

public class HospitalRunnable implements Runnable {

    private BlockingQueue<Case> caseQueue;

    public HospitalRunnable(BlockingQueue<Case> caseQueue) {
        this.caseQueue = caseQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Case pickedCase = caseQueue.take();
                System.out.println("Case: " + pickedCase.getType() + " is taken to the doctor");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
