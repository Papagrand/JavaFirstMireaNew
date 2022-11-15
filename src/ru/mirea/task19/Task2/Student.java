package ru.mirea.task19.Task2;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student>{
    private final String name;
    private final byte score;

    Student(String name, byte score){
        this.name = name;
        this.score = score;
    }

    public byte getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return this.score - student.score;
    }

    public static LinkedList<Student> sortStudents(LinkedList<Student> students){
        for (var i = students.iterator(); i.hasNext(); ){
            Student st1 = i.next();
            for (var j = i; j.hasNext(); j.next()){
                Student st2 = j.next();
                if (st1.compareTo(st2) > 0){
                    Student temp = st2;
                    st2 = st1;
                    st1 = temp;
                }
            }
        }
        return students;
    }
}