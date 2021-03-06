package com.geekbrains.homeworks.homework4;

import com.geekbrains.homeworks.homework4.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> container;

    public FruitBox() {
        this.container = new ArrayList<>();
    }

    public FruitBox(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        this.container.add(fruit);
    }

    public void add(T... fruits) {
        this.container.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        if (container.size() == 0) {
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    public boolean compare(FruitBox<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }


    public void transfer(FruitBox<? super T> another) {
        if (this == another)
            return;

        another.container.addAll(this.container);
        this.container.clear();
    }

}
