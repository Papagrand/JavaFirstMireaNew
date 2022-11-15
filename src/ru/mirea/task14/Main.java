package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void Task1(String line, String reg){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(line);

        String[] str = pattern.split(line);
        for (var s : str) {
            System.out.println(s);
        }
    }

    public static boolean Task2(String line){
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

    static public boolean Task4(String line){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(line);
        String[] str = pattern.split(line);
        for (var s : str){
            if (s.contains("+")) return true;
        }
        return false;
    }

    public static boolean Task6(String line){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]*@[a-z]{0,5}.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

    public static boolean Task7(String line){
        Pattern pattern = Pattern.compile("[0-9a-zA-z+_]{8,}");
        Matcher matcher = pattern.matcher(line);
        return matcher.matches() && Pattern.compile("[0-9]{1,}").matcher(line).find() && Pattern.compile("[a-z]{1,}").matcher(line).find() && Pattern.compile("[A-Z]{1,}").matcher(line).find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите номер задания >> ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                scanner = new Scanner(System.in);
                System.out.print("Введите текст для первого задания и разделитель >> ");
                String line = scanner.nextLine();
                String separator = scanner.next();
                Task1(line, separator);
            }
            case 2 -> {
                scanner = new Scanner(System.in);
                System.out.print("Введите текст >> ");
                String line = scanner.nextLine();
                System.out.println(Task2(line));
            }
            case 4 -> {
                scanner = new Scanner(System.in);
                System.out.print("Введите текст >> ");
                String line = scanner.nextLine();
                System.out.println(Task4(line));
            }

            case 6 -> {
                scanner = new Scanner(System.in);
                System.out.print("Введите текст >> ");
                String line = scanner.nextLine();
                System.out.println(Task6(line));
            }
            case 7 -> {
                scanner = new Scanner(System.in);
                System.out.print("Введите текст >> ");
                String line = scanner.nextLine();
                System.out.println(Task7(line));
            }
        }

    }
}