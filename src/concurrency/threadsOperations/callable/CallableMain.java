package concurrency.threadsOperations.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Marcin Beda.
 */

public class CallableMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        List<Future<Double>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Future<Double> result = service.submit(new Divider((double) i * 5));
            list.add(result);
        }

        for (Future<Double> result : list) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end of main");
    }
}
