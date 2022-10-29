package ru.mirea.task11;

import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя разработчика >>");
        String name =scanner.next();
        long gettingTime, deliveryTime;

        System.out.print("Дата начала выполнения: ");
        gettingTime = scanner.nextLong();
        Date gettingDate=new Date(gettingTime);

        System.out.print("Дата сдачи: ");
        deliveryTime = scanner.nextLong();
        Date deliveryDate = new Date(deliveryTime);

        if(gettingDate.after(deliveryDate)){
            System.out.println("Ошибка введенных данных - "+"Время получения позже времени сдачи");
        }
        else if (gettingDate.equals(deliveryDate)) {
            System.out.println(name + " получил и сдал работу в "+gettingDate);
        }
        else{
            System.out.println(name + " получил работу в "+gettingDate+" , сдал работу в "+deliveryDate);
        }
    }
}
