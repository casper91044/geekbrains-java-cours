package com.geekbrains.homeworks.homework1.animals;

public class Tiger extends Cat{
    public static int count;

    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super("Тигр", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
