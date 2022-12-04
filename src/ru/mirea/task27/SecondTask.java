package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class SecondTask {
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Хоров", "Николай");
        map.put("Бутрим", "Андрей");
        map.put("Стаханов", "Антон");
        map.put("Пятышев", "Евгений");
        map.put("Бутрим", "Александр");
        map.put("Соколов", "Антон");
        map.put("Соколов", "Станислав");
        map.put("Сергеева", "Антон");
        map.put("Захаров", "Павел");
        map.put("Соколов", "Николай");
        return map;
    }
    public static int getSameFirstNameCount(Map<String, String> map, String name)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (lastName.equals(key))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String,String> map=createMap();
        System.out.println(getSameFirstNameCount(map,"Николай"));
        System.out.println(getSameLastNameCount(map,"Пятышев"));
    }
}
