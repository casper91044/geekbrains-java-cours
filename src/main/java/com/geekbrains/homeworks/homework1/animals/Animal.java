package com.geekbrains.homeworks.homework1.animals;

public abstract class Animal {
    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if(distance <= maxRunDistance)
            System.out.println(type + " " + name + " успешно пробежал кросс " + distance + " m.");
        else
            System.out.println(type + " " + name + " не справился с кроссом");
    }

    public void swim(int distance) {
        if (maxSwimDistance <= 0){
            System.out.println(type + " " + name + " не умеет плавать!");
            return;
        }
        if (distance <= maxSwimDistance)
            System.out.println(type + " " + name + " успешно проплыл дистанцию " + distance + " m.");
        else
            System.out.println(type + " " + name + " не справился с заплывом");
    }
}
