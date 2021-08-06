package intermediate.multithreading.basics;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marcin Beda.
 */

public class SleepAndJoinMethods {
    public static void main(String[] args) throws InterruptedException {

        Runnable countdown = () -> {
            try {
                System.out.println("Wykonywany wątek (countdown): " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable blastOff = () -> {
            System.out.println("Wykonywany wątek (countdown): " + Thread.currentThread().getName());
            System.out.println("Blast off!");
        };

        Thread countdownThread = new Thread(countdown, "Countdowns");

        Thread blastOffThread = new Thread(blastOff, "BlastOff");

        countdownThread.start();

        countdownThread.join(400);

        System.out.println("Główny wątek aplikacji: " + Thread.currentThread().getName());

        blastOffThread.start();
    }
}
