package ru.mirea.task13.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person1=new Person();
        Person person2=new Person();
        Person person3=new Person();

        System.out.println("ФИО первого: "+person1.getFullName());

        System.out.print("Введите имя второго: ");
        person2.setFirstName(scanner.next());
        System.out.println("ФИО второго: "+person2.getFullName());

        System.out.print("Введите имя третьего: ");
        person3.setFirstName(scanner.next());
        System.out.print("Введите фамилию третьего: ");
        person3.setLastName((scanner.next()));
        System.out.print("Введите отчество третьего: ");
        person3.setMiddleName((scanner.next()));
        System.out.println("ФИО третьего: "+person3.getFullName());
    }
}
