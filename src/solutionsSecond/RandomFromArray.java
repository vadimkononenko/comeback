package solutionsSecond;

/*  Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
//  Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
//  Пример:
//  Дан массив [1, 2, 3], и массив весов [1, 2, 10].
//  В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
 */

public class RandomFromArray {
    private int[] extendedValues;

    public RandomFromArray(int[] values, int[] weights) {
        int sum = 0;
        for (int weight: weights){
            sum += weight;
        }

        extendedValues = new int[sum];
        int pointer = 0;

        for (int i = 0; i < weights.length; i++){
            for (int j = 0; j < weights[i]; j++){
                extendedValues[pointer++] = values[i];
            }
        }
    }

    public int getRandom(){
        int random = (int) (Math.random() * (extendedValues.length - 1));
        return extendedValues[random];
    }
}
