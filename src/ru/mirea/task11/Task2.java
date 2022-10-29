package ru.mirea.task11;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в милисекундах >> ");
        long userTime=scanner.nextLong();
        Date userDate=new Date(userTime);
        long currTime = System.currentTimeMillis();
        Date currDate = new Date(currTime);
        System.out.println((userDate.getTime()>currDate.getTime())?
                "Время введенное пользователем "+userDate+" позже текущего"+currDate:"Время введенное пользователем "+userDate+" раньше текущего"+currDate);
    }
}
