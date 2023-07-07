package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamExample {

    // find name with highest salary

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"jashan",200.00);
        Employee e2 = new Employee(2,"brijesh",300.00);
        Employee e3 = new Employee(3,"robin",400.00);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.print(employeeList);

     // List<Employee> filterName = employeeList.stream().

    }

}


class Employee
{

    Integer employeeId;
    String employeeName;
    Double employeeSalary;

    public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
