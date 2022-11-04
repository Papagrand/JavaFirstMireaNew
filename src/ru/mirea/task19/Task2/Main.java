package ru.mirea.task19.Task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var students = new LinkedList<Student>();

        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Выберите функцию:\n1. Добавить студента\n2. Поиск студента\n3. Сортировка\n4. Вывод\n>> ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Введи имя и средний балл >> ");
                    String name = scanner.next();
                    byte score = scanner.nextByte();
                    students.add(new Student(name, score));
                }
                case 2 -> {
                    System.out.println("Введи имя для поиска >> ");
                    String searchName = scanner.next();
                    boolean flag = false;
                    for (var s : students){
                        if (s.getName().equals(searchName)){
                            flag = true;
                            break;
                        }
                    }
                    try{
                        if (!flag){
                            throw new StudentNotFoundExeption("Такого студента нет!");
                        }
                        System.out.println("Такой студент существует");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    students = Student.sortStudents(students);
                }
                case 4 -> {
                    for (var s : students){
                        System.out.println(s.getName() + " " + s.getScore());
                    }
                }
                default -> {
                    return;
                }
            }
        }



    }
}