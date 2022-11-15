package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model=model;
        this.view=view;
    }
    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeeDaysWorked(int daysWorked){
        model.setDaysWorked(daysWorked);
    }
    public int getEmployeeDaysWorked(){
        return model.getDaysWorked();
    }

    public void setEmployeePayForDay(int payForDay){
        model.setPayForDay(payForDay);
    }
    public int getEmployeePayForDay(){
        return model.getPayForDay();
    }

    public void updateView(){
        view.printCourseDetails(model.getName(),model.getDaysWorked(),model.getPayForDay());
    }
}
