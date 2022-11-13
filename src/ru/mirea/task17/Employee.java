package ru.mirea.task17;

public class Employee {
    private String EmployeeName;
    private int EmployeeDaysWorked;
    private int EmployeePayForDay;

    public void setName(String employeeName) {
        EmployeeName = employeeName;
    }
    public String getName() {
        return EmployeeName;
    }
    public void setDaysWorked(int employeeDaysWorked) {
        EmployeeDaysWorked = employeeDaysWorked;
    }

    public int getPayForDay() {
        return EmployeePayForDay;
    }

    public void setPayForDay(int employeePayForDay) {
        EmployeePayForDay = employeePayForDay;
    }
    public int getDaysWorked() {
        return EmployeeDaysWorked;
    }

}