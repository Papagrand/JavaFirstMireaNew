package ru.mirea.task21;

public class Array {
    private Object[] arr;
    private int size;

    public Array(int size) {
        this.arr = new Object[size];
        this.size=0;
    }
    public Object get(int ind){
        return arr[ind];
    }
    public void put(int ind, Object elem){
        arr[ind]=elem;
    }

    public static void main(String[] args) {
        Array m = new Array(4);
        m.put(0, 1);
        m.put(1, 1.1);
        m.put(2, Long.parseLong("2"));
        m.put(3, new Integer(3));
        for(int i=0;i<4;++i)
            System.out.println(m.get(i)+" "+m.get(i).getClass());
    }
}