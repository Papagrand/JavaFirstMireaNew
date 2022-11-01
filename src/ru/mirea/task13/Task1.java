package ru.mirea.task13;

public class Task1 {

    public static void correctString(String str){
        System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));
        System.out.println("Проверка на окончание \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Проверка на начало \"I like\": " + str.startsWith("I like"));
        System.out.println("Содержание \"Java\": " + str.contains("Java"));
        System.out.println("Начало \"Java\" c " + str.indexOf("Java"));
        System.out.println("Смена всех \"a\" на \"o\": " + str.replace('a','o'));
        System.out.println("В верхнем регистре: " + str.toUpperCase());
        System.out.println("В нижнем регистре: " + str.toLowerCase());
    }

    public static void main(String[] args) {
        correctString("I like Java!!");
    }

}