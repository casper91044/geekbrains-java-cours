package com.geekbrains.lesson3;

public class MyMatrixException extends MyLibException{

    private int column;
    private int row;
    private int value;

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }

    public MyMatrixException(int column, int row, int[][] array) {
        super("Invalid data in [" + column + "; " + row + "]: " + array[column][row]);
        this.column = column;
        this.row = row;
        this.value = array[column][row];
    }
}
