package com.cjss.training.model;

public class EmployeeModel {

    private String employeeNo;
    private String employeeName;
    private String salary;

    public EmployeeModel(String employeeNo, String employeeName, String salary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}