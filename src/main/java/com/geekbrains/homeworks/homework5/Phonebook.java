package com.geekbrains.homeworks.homework5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, HashSet<String>> hmPhonebook;

    public Phonebook() {
        hmPhonebook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!hmPhonebook.containsKey(name)) {
            hmPhonebook.put(name, new HashSet<>());
        }
        hmPhonebook.get(name).add(phone);
    }

    public Set<String> getPhoneNumberByName(String name) {
        return hmPhonebook.get(name);
    }

    public Set<String> getAllName() {
        return hmPhonebook.keySet();
    }
}
