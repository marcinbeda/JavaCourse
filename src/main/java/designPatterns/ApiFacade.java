package designPatterns;

import designPatterns.databaseForFacade.EmployeeCreator;
import designPatterns.databaseForFacade.EmployeeDatabase;
import designPatterns.decorator.FreqBonus;
import designPatterns.decorator.Payable;
import designPatterns.decorator.SpecialBonus;
import designPatterns.creationPatterns.House;
import designPatterns.functionalPatterns.strategy.BikeTravelStrategy;
import designPatterns.functionalPatterns.strategy.CarTravelStrategy;
import designPatterns.functionalPatterns.strategy.Employee;


public class ApiFacade {

    private EmployeeDatabase eDatabase = new EmployeeDatabase();
    private EmployeeCreator employeeCreator = new EmployeeCreator();

    public Employee createDoctor(int i) {
        Employee mike = employeeCreator.create(EmployeeCreator.BIKE_DOCTOR_SANDWICH);
        mike.setSalary(i);
        eDatabase.addEmployee(mike);
        return mike;
    }

    public void pushDoctorToJob(Employee mike) {
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast();

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();
    }

    public int countSalary(Employee mike) {
        Payable employee = mike;
        if (mike.getSalary() > 8000) {
            employee = new SpecialBonus(employee);
        }
        if (mike.travelStrategy instanceof BikeTravelStrategy) {
            employee = new FreqBonus(employee);
        }
        return employee.getSalary();
    }

    public void giveFreeHouseToBestFreqEmployee(Employee mike) {
        System.out.println(mike.toString() + " dostaje dom " + new House.HouseBuilder()
                .setAdress("ul. Szkolna 2")
                .setDoorsNumber(3)
                .setWindowsNumer(10)
                .build().toString());
    }
}
