package concurrency.threadsOperations.executorService;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.submit(new concurrency.threadsOperations.executorService.ExecutorServiceTask());
        }
    }
}
