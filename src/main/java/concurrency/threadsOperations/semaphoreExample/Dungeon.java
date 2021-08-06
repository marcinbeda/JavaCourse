package concurrency.threadsOperations.semaphoreExample;

import java.util.concurrent.Semaphore;

/**
 * Created by Marcin Beda.
 */

public class Dungeon {

    private Semaphore semaphore;

    public Dungeon(int limitOfPlayers) {
        semaphore = new Semaphore(limitOfPlayers, true);
        semaphore.availablePermits();
    }

    public void tryToEnter() {
        try {
            semaphore.acquire();
            System.out.println("Player from the thread: " + Thread.currentThread().getName() + " enters dungeon");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void leave() {
        System.out.println("Player from the thread: " + Thread.currentThread().getName() + " leaves dungeon");
        semaphore.release();
    }

}
