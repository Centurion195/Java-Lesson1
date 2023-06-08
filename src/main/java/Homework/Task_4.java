//4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//        или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы
//        смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
//        -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

package Homework;

import java.util.*;

public class Task_4 {
    public static void Start(){
        int size = 10;
        int up_random = 100;
        int down_random = 0;
        Scanner scanner = new Scanner(System.in);
        int[] array = CreateArray(size, down_random, up_random);
        System.out.println("array: " + Arrays.toString(array));
        while (true) {
            System.out.print("Введите значение сдвига: ");
            int n = scanner.nextInt();
            System.out.println(Arrays.toString(Offset(array, n)));
            System.out.println(Arrays.toString(Offset2(array, n)));
                System.out.println("array: " + Arrays.toString(array));
            System.out.println(Arrays.toString(Offset3(array, n)));
                System.out.println("array: " + Arrays.toString(array));
        }

    }
    private static int[] CreateArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max);
        }
        return array;
    }
    private static int[] Offset(int[] array, int n) {
        String[] arrayStr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayStr[i] = Integer.toString(array[i]);
        }

        List<String> list = Arrays.asList(arrayStr);
        Collections.rotate(list, n);

        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Integer.parseInt(arrayStr[i]);
        }

        return newArray;
    }
    private static int[] Offset2(int[] array, int n) {
        int len = array.length;
        int[] newArray = new int[len];
        if (n > 0) {
            if (n > len) n = n - len * (n / len);
            for (int i = 0; i < len; i++) {
                if (i < n) newArray[i] = array[len - n + i];
                else newArray[i] = array[i-n];
            }
        } else if (n < 0) {
            if (-n > len) n = n + len * (-n / len);
            for (int i = 0; i < len; i++) {
                if (i < len + n) newArray[i] = array[-n + i];
                else newArray[i] = array[i - len - n];
            }
        } else return array;

        return newArray;
    }
    private static int[] Offset3(int[] array, int n) {
        int len = array.length;
            for (int m = 0; m < n; m++) {
                int temp = array[0];
                int temp2 = temp;
                for (int i = 0; i < len; i++) {
                    temp = temp2;
                    if (i == 0) array[i] = array[len - 1];
                    else {
                        temp2 = array[i];
                        array[i] = temp;
                    }
                }
            }
            return array;
    }
}
