package concurrency.diningPhilosophers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Marcin Beda.
 */

public class Simulation {

    private static final int NUMBER_OF_PHILIOSOPHERS = 5;
    private static final int NUMBER_OF_CHOPSTICKS = 5;
    private static final int SIMULATION_TIME = 6000;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(NUMBER_OF_PHILIOSOPHERS);

        List<Philosopher> philosophers = new ArrayList<>();

        try {
            List<Chopstick> chopsticks = new ArrayList<>();

            for (int i = 0; i < NUMBER_OF_CHOPSTICKS; i++) {
                chopsticks.add(new Chopstick(i));
            }

            for (int i = 0; i < NUMBER_OF_PHILIOSOPHERS; i++) {
                philosophers.add(new Philosopher(i, chopsticks.get(i), chopsticks.get((i + 1) % NUMBER_OF_CHOPSTICKS)));
                service.execute(philosophers.get(i));
            }

            Thread.sleep(SIMULATION_TIME);

            for (Philosopher philosopher : philosophers) {
                philosopher.setFull(true);
            }

        } finally {
            service.shutdown();
            while (!service.isTerminated()) {
                Thread.sleep(1000);
            }

            for (Philosopher philosopher : philosophers) {
                System.out.println(philosopher + " eats " + philosopher.getEatingCounter());
            }
        }
    }
}
