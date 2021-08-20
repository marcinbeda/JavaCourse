package designPatterns;

import designPatterns.adapter.OfficialTrippingEmployee;
import designPatterns.decorator.DeadlineBonus;
import designPatterns.decorator.FreqBonus;
import designPatterns.decorator.Payable;
import designPatterns.decorator.SpecialBonus;
import designPatterns.creationPatterns.FamilyHouse;
import designPatterns.creationPatterns.House;
import designPatterns.creationPatterns.Logger;
import designPatterns.functionalPatterns.observers.ObservableTempValue;
import designPatterns.functionalPatterns.strategy.*;


public class DesignPatternsMain {

    public static void main(String[] args) throws InterruptedException {
/*      Uncomment to test these patterns
        creationPatterns();
        observerPattern();
        strategyPattern();
        adapterPattern();
        decoratorPattern();*/

        ApiFacade facade = new ApiFacade();
        Employee mike = facade.createDoctor(10000);
        facade.pushDoctorToJob(mike);
        System.out.println("zarobki " + facade.countSalary(mike));
        facade.giveFreeHouseToBestFreqEmployee(mike);

        return;
    }

    private static void decoratorPattern() {
        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();
        mike.jobStrategy = new DoctorJobStrategy();

        mike.setSalary(10000);

        System.out.println("Zarobki " + mike.getSalary());

        System.out.println("Zarobki " + new FreqBonus(new DeadlineBonus(new SpecialBonus(mike))).getSalary());

        Payable employee = mike;
        if (employee.getSalary() > 8000) {
            employee = new SpecialBonus(employee);
        }
        if (mike.travelStrategy instanceof BikeTravelStrategy) {
            employee = new FreqBonus(employee);
        }
//        System.out.println("Zarobki " + employee.getSalary());
        int finalSalary = employee.getSalary();
        mike.setSalary(finalSalary);
        System.out.println("Zarobki " + mike.getSalary());
    }

    private static void adapterPattern() {
        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();
        mike.jobStrategy = new DoctorJobStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast();

        OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
        otMike.goToClient();
    }

    private static void strategyPattern() {
        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();
        mike.jobStrategy = new DoctorJobStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast();

        mike.travelStrategy = new CarTravelStrategy();
    }

    private static void observerPattern() throws InterruptedException {

        ObservableTempValue observableValue = new ObservableTempValue();

        observableValue.addObserver((observable, o) -> System.out.println("1 " + o.toString()));
        observableValue.addObserver((observable, o) -> System.out.println("2 " + o.toString()));

        // Test for observers
        while (true) {
            Thread.sleep(500);
            observableValue.setValue((int) (observableValue.getOldTemp() + Math.random() * 3 - 1));
        }
    }

    private static void creationPatterns() {

        // BUILDER PATTERN
        // new House("ul. Kursowa 2", 2, 3, 12);
        House house = new House.HouseBuilder()
                .setAdress("ul. Szkolna 2")
                .setDoorsNumber(3)
                .setWindowsNumer(10)
                .build();

        // STATIC MANUFACTURING METHODS PATTERN
        //from, of, valueOf, instanceOf
        boolean isTrue = true;
        Boolean.valueOf(isTrue);

        FamilyHouse familyHouse = FamilyHouse.from(house);

        // SINGLETON PATTERN
        Logger.getInstance().logToConsole();
    }
}
