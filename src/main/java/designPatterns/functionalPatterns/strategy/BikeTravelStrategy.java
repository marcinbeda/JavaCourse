package designPatterns.functionalPatterns.strategy;


public class BikeTravelStrategy implements TravelStrategy {

    @Override
    public void goToWork() {
        System.out.println("Going by bike");
    }
}
