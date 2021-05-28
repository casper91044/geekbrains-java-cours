package com.geekbrains.homeworks.homework1.animals;

public class Dog extends Animal{
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("Пёс", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
