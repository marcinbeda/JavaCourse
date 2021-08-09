package designPatterns.databaseForFacade;

import designPatterns.functionalPatterns.strategy.Employee;

import java.util.ArrayList;

/**
 * Created by Marcin Beda.
 */

public class EmployeeDatabase {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee());
        employeeList.add(new Employee());
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }



}
