package com.geekbrains.homeworks.homework5;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        wordsList("A", "B", "C", "D", "E", "A", "B", "E", "A", "C", "C");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "+79260000001");
        phonebook.add("Ivanov", "+79260000002");
        phonebook.add("Petrov", "+79260000003");
        phonebook.add("Petrov", "+79260000004");
        phonebook.add("Petrov", "+79260000005");
        phonebook.add("Suvorov", "+79260000006");
        phonebook.add("Suvorov", "+79260000007");

        phonebook.getAllName().forEach(e -> System.out.println("[" + e + "] - " +
                phonebook.getPhoneNumberByName(e)));
    }

    public static void wordsList(String... arr) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str: arr) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
