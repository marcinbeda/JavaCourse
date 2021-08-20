package intermediate.multithreading.completableFuture;

import java.util.concurrent.*;


public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture.runAsync(() -> System.out.println("Watek: " + Thread.currentThread().getName()), executor);

        CompletableFuture<Integer> result = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        }, executor);

        System.out.println(result.get());

        executor.shutdown();
    }
}
