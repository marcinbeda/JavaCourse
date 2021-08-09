package designPatterns.adapter;

import designPatterns.functionalPatterns.strategy.Employee;

/**
 * Created by Marcin Beda.
 */

public class OfficialTrippingEmployee {

    private Employee employee;

    public OfficialTrippingEmployee(Employee employee) {
        this.employee = employee;
    }

    public void goToClient() {
        employee.goToWork();
        System.out.println(" to client");
    }
}
