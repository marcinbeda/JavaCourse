package designPatterns.functionalPatterns.strategy;

/**
 * Created by Marcin Beda.
 */

public class BikeTravelStrategy implements TravelStrategy {

    @Override
    public void goToWork() {
        System.out.println("Going by bike");
    }
}
