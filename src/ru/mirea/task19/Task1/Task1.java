package ru.mirea.task19.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введитк ФИО и ИНН >> ");
        String last, firts, middleName;
        String INN;
        last = scanner.next();
        firts = scanner.next();
        middleName = scanner.next();

        try {
            INN = scanner.next();
            if (!checkTIN(INN)) throw new INN_Exeption("Ошибка ввода ИНН");
            System.out.println("Все в порядке");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkTIN(String INN){
        for (int i = 0; i < INN.length(); i++){
            if (!Character.isDigit(INN.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

class INN_Exeption extends Exception{
    public INN_Exeption(String message){
        super(message);
    }
}