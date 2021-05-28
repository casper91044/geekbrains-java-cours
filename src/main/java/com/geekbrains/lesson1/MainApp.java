package com.geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Cat;
import com.geekbrains.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Bars", "Black", 4);
        Cat cat2 = new Cat("July", "White", 7);
        Dog dog = new Dog("Bobik", "White", 3);


        cat.info();
        cat2.info();

        cat.voice();
        dog.voice();
    }


}
