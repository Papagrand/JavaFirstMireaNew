package ru.mirea.task27;

import java.util.*;

public class HashToTreeSet {

    public static void main(String args[])
    {
        // создаем HashSet
        HashSet<String> set = new HashSet<String>();
        // добавляем элементы в HashSet используя add()
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        System.out.println("Original HashSet: " + set);
// сортировка HashSet с использованием List
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        // печатаем отсортированные элементы HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);


        Set<String> tree_set = new TreeSet<String>(set);

        System.out.println("TreeSet elements" + " in sorted order: ");
        System.out.print("[");
        for(String element : tree_set){
            System.out.print(element+" ");
        }
        System.out.println("]");
    }
}
