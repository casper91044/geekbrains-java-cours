package com.geekbrains.homeworks.homework1;

import com.geekbrains.homeworks.homework1.animals.*;

/** Практическое задание:
 1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих
 класса).
 2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
 препятствия.
 3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
 плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
 печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
 4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
 проплыть.
 5. * Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.*/

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Tom", 200),
                new Dog("Bob", 1000, 50),
                new Tiger("Jeff", 10000, 500)
        };
        for (Animal o : animals) {
            o.run(800);
            o.swim(40);
        }
        System.out.println("Animals count: " + Animal.count);
        System.out.println("Cat count: " + Cat.count);
    }
}
