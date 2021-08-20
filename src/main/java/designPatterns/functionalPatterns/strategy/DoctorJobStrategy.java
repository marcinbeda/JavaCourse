package designPatterns.functionalPatterns.strategy;


public class DoctorJobStrategy implements JobStrategy {

    @Override
    public void doYourJob() {
        System.out.println("Cure people");
    }
}
