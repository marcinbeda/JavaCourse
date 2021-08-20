package concurrency.threadsOperations.locks;


public class LockMain {

    public static void main(String[] args) {

        LockExample lockExample = new LockExample();

        Thread thread1 = new Thread(lockExample::incrementCounter);
        Thread thread2 = new Thread(lockExample::incrementCounter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter result: " + lockExample.getCounter());

    }
}
