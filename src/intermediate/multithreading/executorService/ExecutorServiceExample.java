package intermediate.multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marcin Beda.
 */

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Główny wątek aplikacji: " + Thread.currentThread().getName());

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable countdown = () -> {
            try {
                System.out.println("Wykonywany wątek: " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED EXCEPTION!");
                e.printStackTrace();
            }
        };

        Runnable blastOff = () -> {
            System.out.println("Wykonywany wątek (countdown): " + Thread.currentThread().getName());
            System.out.println("Blast off!");
        };

        executor.submit(countdown);
        executor.submit(blastOff);

        executor.shutdown();
    }
}
