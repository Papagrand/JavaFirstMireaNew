package ru.mirea.task19.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введитк ФИО и ИНН >> ");
        String last, firts, middleName;
        String TIN;
        last = scanner.next();
        firts = scanner.next();
        middleName = scanner.next();

        try {
            TIN = scanner.next();
            if (!checkTIN(TIN)) throw new TIN_Exeption("Ошибка ввода ИНН");
            System.out.println("Все в порядке");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkTIN(String TIN){
        for (int i = 0; i < TIN.length(); i++){
            if (TIN.charAt(i) < '0' || TIN.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}

class TIN_Exeption extends Exception{
    public TIN_Exeption(String message){
        super(message);
    }
}