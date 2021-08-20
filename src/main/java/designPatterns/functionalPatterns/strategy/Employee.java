package designPatterns.functionalPatterns.strategy;

import designPatterns.decorator.Payable;


public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy, Payable {

    private int salary = 0;

    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;

    @Override
    public void eatYourBreakfast() {
        breakfastStrategy.eatYourBreakfast();
    }

    @Override
    public void doYourJob() {
        jobStrategy.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", travelStrategy=" + travelStrategy +
                ", jobStrategy=" + jobStrategy +
                ", breakfastStrategy=" + breakfastStrategy +
                '}';
    }
}
