package concurrency.threadsOperations.basicsOperationsAndCreationThreads;


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
