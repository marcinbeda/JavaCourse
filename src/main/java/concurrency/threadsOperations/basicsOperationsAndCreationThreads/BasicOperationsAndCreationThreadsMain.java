package concurrency.threadsOperations.basicsOperationsAndCreationThreads;


public class BasicOperationsAndCreationThreadsMain {

    public static void main(String[] args) {

        Thread thread = new Thread(new LoopedComputationRunnable());
        thread.start();
        thread.interrupt();

        Thread thread1 = new Thread(new ApiConnectionRunnable());
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new ExampleRunnable());
        thread2.setName("Second loop thread");
        System.out.println("Second thread name is: " + thread2.getName());
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Second thread priority: " + thread2.getPriority());
        thread2.start();

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        Thread thread3 = new ExampleThread();
        thread3.start();

        try {
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Job is done");
    }

}
