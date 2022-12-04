package ru.mirea.task32;

import java.io.*;

public class Task32 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo obj1, obj2;
        obj1 = new CurrencyInfo("Bitcoin", 17016.25);

        System.out.println("Сериализация\n"+obj1.toString());
        FileOutputStream outputStream = new FileOutputStream("src\\ru\\mirea\\task32\\task32ser.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(obj1);
        objectOutputStream.close();

        System.out.println("---------------------------------------------------------------------------------------");

        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {}

        FileInputStream fileInputStream = new FileInputStream("src\\ru\\mirea\\task32\\task32ser.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        obj2 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println("Дессериализация\n" + obj2.toString());
    }
}
