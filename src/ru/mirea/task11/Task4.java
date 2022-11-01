package ru.mirea.task11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Calendar calendar=new GregorianCalendar();
        Scanner scanner= new Scanner(System.in);

        System.out.print("Введите год<<");
        int year=scanner.nextInt();
        System.out.print("Введите месяц<<");
        int mouth = scanner.nextInt()-1;
        System.out.print("Введите день<<");
        int day=scanner.nextInt()-1;
        System.out.print("Введите час<<");
        int hours=scanner.nextInt();
        System.out.print("Введите минуту<<");
        int minutes=scanner.nextInt();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,mouth);
        calendar.set(Calendar.DATE,day);
        calendar.set(Calendar.HOUR,hours);
        calendar.set(Calendar.MINUTE,minutes);


        System.out.println(calendar.getTime());
    }
}
