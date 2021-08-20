package concurrency.threadsOperations.waitAndNotify;


public class WaitAndNotifyMain {

    public static void main(String[] args) {

        WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();

        Thread thread0 = new Thread(() -> {
            try {
                waitAndNotifyExample.waitMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread0.start();

        Thread thread1 = new Thread(() -> {
            try {
                waitAndNotifyExample.anotherWaitMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                waitAndNotifyExample.yetAnotherWaitMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread2.start();
    }
}
