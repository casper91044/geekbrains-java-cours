package com.geekbrains.homeworks.homework1.animals;

public abstract class Cat extends Animal {
    public static int count;

    public Cat(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
