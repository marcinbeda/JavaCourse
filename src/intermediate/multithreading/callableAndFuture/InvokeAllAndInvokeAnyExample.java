package intermediate.multithreading.callableAndFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Marcin Beda.
 */

public class InvokeAllAndInvokeAnyExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Callable<Integer> answerToEverything = () -> {
            TimeUnit.SECONDS.sleep(10);
            return 42;
        };

        Callable<Integer> anotherAnswerToEverything = () -> {
            TimeUnit.SECONDS.sleep(13);
            return 43;
        };

        Callable<Integer> finalAnswerToEverything = () -> {
            TimeUnit.SECONDS.sleep(5);
            return 44;
        };

        List<Callable<Integer>> callableList = Arrays.asList(answerToEverything, anotherAnswerToEverything, finalAnswerToEverything);

        List<Future<Integer>> futures = executor.invokeAll(callableList);

        Integer integer = executor.invokeAny(callableList);

        System.out.println(integer);

//        for(Future<Integer> f : futures) {
//            System.out.println(f.get());

//        }

        executor.shutdown();
    }
}