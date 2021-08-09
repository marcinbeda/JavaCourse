package designPatterns.functionalPatterns.strategy;

/**
 * Created by Marcin Beda.
 */

public class CarTravelStrategy implements TravelStrategy {

    @Override
    public void goToWork() {
        System.out.println("Go by car");
    }
}
