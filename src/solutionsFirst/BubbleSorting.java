package solutionsFirst;

import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {

        Random r = new Random();
        int n = 20;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
