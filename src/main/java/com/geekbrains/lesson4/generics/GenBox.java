package com.geekbrains.lesson4.generics;

public class GenBox<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenBox(T obj) {
        this.obj = obj;
    }


}
