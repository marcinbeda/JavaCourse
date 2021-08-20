package concurrency.threadsOperations.volatileExample;


public class VolatileMain {

    public static void main(String[] args) {

        SharedCounter counter = new SharedCounter();
        Thread counterThread = new Thread(new IncrementingRunnable(counter));
        Thread readingThread = new Thread(new ReadingRunnable(counter));
        counterThread.start();
        readingThread.start();
    }
}
