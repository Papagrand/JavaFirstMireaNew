package ru.mirea.task26;


import java.util.HashSet;
import java.util.Iterator;

class Test
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();

        // Добавляем элементы в HashSet с помощью метода add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// пытаемся добавить еще один такой же элемент

        // Выводим элементы HashSet в консоль
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

        // Удаляем элементы из множества с помощью метода remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
