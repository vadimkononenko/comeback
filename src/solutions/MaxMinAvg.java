package solutions;

public class MaxMinAvg {
    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i <= array.length - 1; i++){
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i <= array.length - 1; i++){
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
            avg += array[i]/array.length;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);

    }
}
