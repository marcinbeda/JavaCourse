package concurrency.threadsOperations.waitAndNotify;

/**
 * Created by Marcin Beda.
 */

public class WaitAndNotifyExample {

    public synchronized void waitMethod() throws InterruptedException {
        System.out.println("Entering the wait method, thread name: " + Thread.currentThread().getName());
        wait();
        System.out.println("Leaving the wait method, thread name: " + Thread.currentThread().getName());
    }

    public synchronized void anotherWaitMethod() throws InterruptedException {
        System.out.println("Entering the wait anotherWaitMethod, thread name: " + Thread.currentThread().getName());
        wait();
        System.out.println("Leaving the wait anotherWaitMethod, thread name: " + Thread.currentThread().getName());
    }

    public synchronized void yetAnotherWaitMethod() throws InterruptedException {
        System.out.println("Entering the wait yetAnotherWaitMethod, thread name: " + Thread.currentThread().getName());
        wait();
        System.out.println("Leaving the wait yetAnotherWaitMethod, thread name: " + Thread.currentThread().getName());
    }

    public synchronized void notifyMethod() throws InterruptedException {
        Thread.sleep(2000);
        notifyAll();
        System.out.println("notifyAll() method triggered");
    }

}
