package concurrency.threadsOperations.basicsOperationsAndCreationThreads;

/**
 * Created by Marcin Beda.
 */

public class ExampleRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ExampleRunnable loop: " + i);
        }
    }
}
