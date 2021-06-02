package com.geekbrains.lesson3;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 8, 12}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7 || arr[i][j] == 12)
                    throw new MyMatrixException(i, j, arr);
            }
        }
    }
}
