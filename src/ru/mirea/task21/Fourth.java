package ru.mirea.task21;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Fourth {
    public static List<Object> list = new LinkedList<>();
    public static void main(String[] args) {
        File file = new File("C:/Users/kolya/IdeaProjects/JavaFirstMireaNew/src/ru/mirea//task21");
        for(Object f : file.listFiles()){
            list.add(f);
        }
        for(int i=0;i<5;++i) {
            System.out.println(list.get(i));
        }
    }
}