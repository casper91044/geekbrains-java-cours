package com.geekbrains.homeworks.homework3;

public class MyArrayDataException extends MyException{

    private int column;
    private int row;
    private String array;

    public MyArrayDataException(int column, int row, String[][] array) {
        super("Некорректные данные в [" + column + "; " + row + "]: " + array[column][row]);
        this.column = column;
        this.row = row;
        this.array = array[column][row];
    }
}
