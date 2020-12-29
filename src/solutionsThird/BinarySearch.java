package solutionsThird;

/*
    Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
    Используйте перебор и двоичный поиск для решения этой задачи.
 */

import java.util.Arrays;

public class BinarySearch {
    public static double bruteForce(double[] values, double number){
        // если не находим number в массиве, то вернётся -1
        double foundNumber = -1;
        for (double value : values) {
            if (value == number) {
                foundNumber = value;
            }
        }
        return foundNumber;
    }

    public static int binarySearchRecursively(double[] sortedArray, double key){
        return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
    }

    private static int binarySearchRecursively(double[] sortedArray, double key, int low, int high){
        int middle = (low + high) / 2; // середина

        if (high < low){ // больше делить нечего
            return -1;
        }

        if (key == sortedArray[middle]){ // если нашелся
            return middle;
        } else if(key < sortedArray[middle]){ // ищем в левой половине
            return binarySearchRecursively(sortedArray,key, low, middle - 1);
        } else { // ищем в правой половине
            return binarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }

    // спомогательный метод для тестов
    private static double[] generateRandomArray(int length){
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = generateRandomArray(100000);
        Arrays.sort(array);

        long time = System.currentTimeMillis(); // текущее время
        bruteForce(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        binarySearchRecursively(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
    }

}
