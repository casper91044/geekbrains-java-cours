package com.geekbrains.lesson2;

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is fly");
    }

    @Override
    public void swim() {
        System.out.println(2);
    }
}
