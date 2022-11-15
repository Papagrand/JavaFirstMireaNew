package ru.mirea.task17;

public class EmployeeView {
    public void printCourseDetails(String EmployeeName, int EmployeeDaysWorked, int EmployeePayForDay){
        System.out.println("Employee Details: ");
        System.out.println("Name: " + EmployeeName);
        System.out.println("Days worked: " + EmployeeDaysWorked);
        System.out.println("Pay for day: " + EmployeePayForDay);
        System.out.println("Mouthly salary: " + EmployeeDaysWorked*EmployeePayForDay);
    }
}
