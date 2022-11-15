package ru.mirea.task18.Task5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
//Причиной ошибки, может является, например неправильное
//значение для параметра. Может было бы лучше, если бы метод вызывал
//getDetails() и там решалась бы эта проблема.