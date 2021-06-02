package com.geekbrains.lesson4.generics;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//        //...
//        //intBox1.setObj("Java");
//        //...
//        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
//            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//            System.out.println("Sum = " + sum);
//        } else {
//            System.out.println("ERROR");
//        }

//        GenBox<String> stringGenBox = new GenBox<>("Java");
//        GenBox<Integer> integerGenBox1 = new GenBox<>(10);
//        GenBox<Integer> integerGenBox2 = new GenBox<>(20);
//
//        int sum = integerGenBox1.getObj() + integerGenBox2.getObj();
//        System.out.println("Sum = " + sum);

//        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3, 4);
//        System.out.println(intBox.average());
//
//        BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(1, 2, 3, 4);
//        System.out.println(intBox2.average());
//
//        BoxWithNumbers<Float> floatBox = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f, 4.0f);
//        System.out.println(floatBox.average());
//
//        System.out.println(intBox.compareAverage(floatBox));
//
//        GenBox<Number> gbn = new GenBox<>(1);
//        GenBox<Integer> gbi = new GenBox<>(1);
//        doSomething1(gbn);
//        doSomething2(gbn);
//        doSomething1(gbi);
//        doSomething2(gbi);
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }

//    public static void doSomething1(GenBox<? extends Number> box) {
//    }
//
//    public static void doSomething2(GenBox<Number> box) {
//    }
//
//    public static void doSomething3(GenBox<? super Number> box) {
//    }

}
