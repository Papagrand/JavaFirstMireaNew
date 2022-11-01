package ru.mirea.task11;

import java.util.*;

public class Task5 {
    public static void main(String[] args){
        var linked = new LinkedList<Integer>();
        var array = new ArrayList<Integer>();
        System.out.println("Добавление в конец");
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            array.add(i);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            linked.add(i);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");

        System.out.println();

        System.out.println("Удаление с начала");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            array.remove(0);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");
        array.clear();

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linked.remove(0);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");
        linked.clear();

        System.out.println();

        System.out.println("Вставка в начало");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            array.add(0, i);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linked.add(0,i);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");

        System.out.println();

        System.out.println("Поиск последнего элемента");
        start = System.currentTimeMillis();
        array.indexOf(0);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");

        start = System.currentTimeMillis();
        linked.getLast();
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");
    }
}