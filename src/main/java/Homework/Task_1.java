//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

package Homework;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void Start(){
        int size = 15;
        int up_random = 100;
        int down_random = 0;
        int[] array = CreateArray(size, down_random, up_random);
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + SearchMinAndMax(array)[0]);
        System.out.println("Max: " + SearchMinAndMax(array)[1]);
    }
    private static int[] CreateArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max);
        }
        return array;
    }
    private static int[] SearchMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        return new int[] {min, max};
    }
}
