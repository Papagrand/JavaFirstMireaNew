package ru.mirea.task20;

class Test<T,V,K>{
    T t;
    V v;
    K k;

    public Test(T t, V v, K k){
        this.k = k;
        this.t = t;
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyClass{" + "t class =" + t.getClass() + ", v class =" + v.getClass() + ", k class =" + k.getClass() + '}';
    }
}

class Task1{
    public static void main(String[] args) {
        Test<Integer, Boolean, Character> cl = new Test<>(3, true, 'c');
        System.out.println(cl.toString());
    }
}