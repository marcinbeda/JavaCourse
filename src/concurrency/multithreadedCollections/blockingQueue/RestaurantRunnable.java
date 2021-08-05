package concurrency.multithreadedCollections.blockingQueue;

/**
 * Created by Marcin Beda.
 */

import java.util.concurrent.BlockingQueue;

public class RestaurantRunnable implements Runnable {

    private BlockingQueue<String> orderQueue;

    public RestaurantRunnable(BlockingQueue<String> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String orderToGive = orderQueue.take();
                System.out.println("Giving order: " + orderToGive);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
