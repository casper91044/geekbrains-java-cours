package com.geekbrains.lesson5;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "B");
        map.put("C", "D");
        for (Map.Entry<String, String> o : map.entrySet()) {
            System.out.println(o.getKey());
            System.out.println(o.getValue());
            System.out.println("---");
        }

        System.out.println(map.getOrDefault("Z", "Q"));


        List<String> list = new ArrayList<>(Arrays.asList("A", "A", "C", "B", "A"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String o = iterator.next();
            if (o.equals("A")) {
                iterator.remove();
            }
        }
        System.out.println(list);


        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("AAAA");
        set.add("AAA");
        set.add("AA");
        set.add("AAA");
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String o = setIterator.next();
            if (o.length() > 2) {
                setIterator.remove();
            }
        }
        System.out.println(set);



    }
}
