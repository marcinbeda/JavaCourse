package concurrency.threadsOperations.semaphoreExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Marcin Beda.
 */

public class SemaphoreMain {

    public static void main(String[] args) {

        Dungeon dungeon = new Dungeon(3);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++) {
            executorService.submit(() -> {
                dungeon.tryToEnter();
                dungeon.leave();
            });
        }
    }
}
