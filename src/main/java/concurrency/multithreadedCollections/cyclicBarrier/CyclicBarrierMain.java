package concurrency.multithreadedCollections.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CyclicBarrierMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Knight is ready"));

        service.execute(new CyclicBarrierRunnable(
                "preparing armor",
                "bringing armor",
                5000,
                barrier));

        service.execute(new CyclicBarrierRunnable(
                "preparing horse",
                "bringing horse",
                7000,
                barrier));

        service.execute(new CyclicBarrierRunnable(
                "preparing sword",
                "bringing sword",
                9000,
                barrier));
    }
}
