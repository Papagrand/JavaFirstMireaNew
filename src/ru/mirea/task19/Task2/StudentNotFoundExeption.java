package ru.mirea.task19.Task2;

public class StudentNotFoundExeption extends Exception {
    public StudentNotFoundExeption(String messageError){
        super(messageError);
    }
}