package ru.mirea.task13.Task2;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    {
        firstName="indefinite";
        lastName="indefinite";
        middleName="indefinite";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getFullName(){
        return lastName+" "+firstName+" "+middleName;
    }
}
