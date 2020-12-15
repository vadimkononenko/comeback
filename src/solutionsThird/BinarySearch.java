package solutionsThird;

/*
    Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
    Используйте перебор и двоичный поиск для решения этой задачи.
 */

public class BinarySearch {
    public int enumeration(int[] values, int number){
        // если не находим number в массиве, то вернётся -1
        int foundNumber = -1;
        for (int value : values) {
            if (value == number) {
                foundNumber = value;
            }
        }
        return foundNumber;
    }
}
