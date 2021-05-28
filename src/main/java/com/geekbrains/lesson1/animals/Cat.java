package com.geekbrains.lesson1.animals;

public class Cat extends Animal {
    int clawsLength;

    public Cat(String name, String color, int age) {
        super(name,color,age);
    }

    @Override
    public void voice() {
        System.out.println(name + " meow");

    }
}
