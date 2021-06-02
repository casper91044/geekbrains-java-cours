package com.geekbrains.lesson3;

public class MyLibException extends RuntimeException{
    public MyLibException() {
    }

    public MyLibException(String message) {
        super(message);
    }
}
