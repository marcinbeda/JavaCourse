package designPatterns.functionalPatterns.strategy;

/**
 * Created by Marcin Beda.
 */

public class DoctorJobStrategy implements JobStrategy {

    @Override
    public void doYourJob() {
        System.out.println("Cure people");
    }
}
