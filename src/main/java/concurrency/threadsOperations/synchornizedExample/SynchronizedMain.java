package concurrency.threadsOperations.synchornizedExample;

/**
 * Created by Marcin Beda.
 */

public class SynchronizedMain {

    public static void main(String[] args) {

        SynchronizedCounter counter = new SynchronizedCounter();

        Thread thread1 = new Thread(new SynchronizedRunnable(counter));
        Thread thread2 = new Thread(new SynchronizedRunnable(counter));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result of the counter incrementation: " + counter.getCounter());

    }
}
