package concurrency.threadsOperations.basicsOperationsAndCreationThreads;

/**
 * Created by Marcin Beda.
 */

public class ApiConnectionRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            System.out.println("Closing Thread with ApiConnectionRunnable");
        }
    }
}
