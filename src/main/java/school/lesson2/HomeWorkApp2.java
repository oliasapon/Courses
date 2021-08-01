package school.lesson2;

import java.util.Arrays;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(sumFrom10To20(3, 12));
        positiveOrNegativeNumber(-12);
        System.out.println(isPositiveOrNegative(12));
        printLineNTimes("Sunny day!", 2);
        System.out.println(leapYear(2000));
        replacingArrayElements();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(returnArray(7, 12)));
        minAndMaxValue();

        int[] array = {2, 3, 7, 1, 4, 8, 5};
        displacementArray(array, 3);
    }

    public static boolean sumFrom10To20(int x1, int x2) {
        return (x1 + x2) > 10 && (x1 + x2) <= 20;
    }

    public static void positiveOrNegativeNumber(int x) {
        String result = (x >= 0) ? "х = " + x + " - положительное число!" : "х = " + x + " - отрицательное число!";
        System.out.println(result);
    }

    public static boolean isPositiveOrNegative(int x) {
        return x < 0;
    }

    public static void printLineNTimes(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void replacingArrayElements() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        int value = 1;
        for (int i = 0; i < 100; i++) {
            array[i] = value;
            value++;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - 1 - i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        int i = 0;
        while (i < array.length) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        return array;
    }

    public static void minAndMaxValue() {
        int[] array = {4, 6, 12, -6, 3, -23, 23, 0, 56};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min + "\nМаксимальное значение массива: " + max);
    }

    public static void displacementArray(int[] array, int n) {
        System.out.println("Начальный массив: " + Arrays.toString(array));
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int var = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = var;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int var = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = var;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
}
