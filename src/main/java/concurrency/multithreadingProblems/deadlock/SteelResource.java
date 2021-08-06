package concurrency.multithreadingProblems.deadlock;

/**
 * Created by Marcin Beda.
 */


public class SteelResource {

    public void getSteel() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting steel for thread: " + Thread.currentThread().getName());
    }
}
