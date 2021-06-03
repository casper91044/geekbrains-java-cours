package com.geekbrains.homeworks.homework4;

import com.geekbrains.homeworks.homework4.fruits.Apple;
import com.geekbrains.homeworks.homework4.fruits.Fruit;
import com.geekbrains.homeworks.homework4.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

/**Практическое задание
 1. Написать метод, который меняет два элемента массива местами (массив может быть любого
 ссылочного типа).
 2. Написать метод, который преобразует массив в ArrayList.
 3. Задача:
 a. Даны классы Fruit -> Apple, Orange.
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
 фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
 c. Для хранения фруктов внутри коробки можно использовать ArrayList.
 d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
 фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
 важны).
 e. Внутри класса Box написать метод Compare, который позволяет сравнить текущую
 коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
 равны, False — в противном случае. Можно сравнивать коробки с яблоками и
 апельсинами.
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
 объекты, которые были в первой.
 g. Не забываем про метод добавления фрукта в коробку*/

public class MainApp {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Apple> anotherAppleBox = new FruitBox<>(new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());
        FruitBox<Fruit> fruitBox = new FruitBox<>();

//        appleBox.transfer(fruitBox);
//        appleBox.transfer(anotherAppleBox);
//        appleBox.transfer(orangeBox);
//        fruitBox.transfer(appleBox);
    }

    public static void swap(Object[] arr, int n1, int n2) {
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }

    public static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
