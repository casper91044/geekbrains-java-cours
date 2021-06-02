package com.geekbrains.homeworks.homework3;

/**Практическое задание
 1. Создайте исключения: MyArraySizeException (неправильный размер массива), и
 MyArrayDataException (в ячейке массива лежит что-то не то);
 2. Напишите метод, на вход которого подаётся двумерный строковый
 массив (String[][]) размером 4×4. При подаче массива другого размера
 необходимо бросить исключение MyArraySizeException.
 3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
 просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
 ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет
 данных для этой матрицы прекращается.
 4. В методе main() нужно вызвать полученный метод, обработать возможные исключения
 MySizeArrayException и MyArrayDataException и вывести результат расчёта.*/

public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"8", "7", "6", "5"},
                {"4", "3", "2", "10"}
        };
        System.out.println("Сумма всех элементов матрицы = " + calculate(arr));
    }

    public static int calculate(String [][] data) {
        if (data.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (data[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try{
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, data);
                }
            }
        }
        return sum;
    }
}
