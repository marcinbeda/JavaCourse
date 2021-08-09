package designPatterns.databaseForFacade;

import designPatterns.functionalPatterns.strategy.BikeTravelStrategy;
import designPatterns.functionalPatterns.strategy.DoctorJobStrategy;
import designPatterns.functionalPatterns.strategy.Employee;
import designPatterns.functionalPatterns.strategy.SandwichBreakfastStrategy;

/**
 * Created by Marcin Beda.
 */

public class EmployeeCreator {

    public static final String BIKE_DOCTOR_SANDWICH = "bikeDoctorSandwich";

    public Employee create(String employeeType){
        switch (employeeType) {
            case BIKE_DOCTOR_SANDWICH:
            {
                Employee mike = new Employee();

                mike.travelStrategy = new BikeTravelStrategy();
                mike.jobStrategy = new DoctorJobStrategy();
                mike.breakfastStrategy = new SandwichBreakfastStrategy();
                return mike;
            }
            default: return new Employee();
        }
    }

}
