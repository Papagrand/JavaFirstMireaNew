package ru.mirea.task13;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона >> ");
        StringBuilder Number = new StringBuilder(scanner.next());
        if (!Number.toString().startsWith("+")){
            Number.deleteCharAt(0);
            Number.insert(0,"7");
            Number.insert(0, "+");
        }

        Number.insert(5, "-");
        Number.insert(9, "-");
        System.out.println(Number);
    }

}