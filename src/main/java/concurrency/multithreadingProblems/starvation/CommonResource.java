package concurrency.multithreadingProblems.starvation;

/**
 * Created by Marcin Beda.
 */

public class CommonResource {

    public synchronized void getResource() {
        System.out.println("Doing some heavy processing for the thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
