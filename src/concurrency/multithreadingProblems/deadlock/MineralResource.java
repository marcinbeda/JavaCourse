package concurrency.multithreadingProblems.deadlock;

/**
 * Created by Marcin Beda.
 */


public class MineralResource {

    public void getMinerals() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting minerals for thread: " + Thread.currentThread().getName());
    }
}
