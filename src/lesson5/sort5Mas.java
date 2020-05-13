package lesson5;

import java.util.Arrays;

public class sort5Mas {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 45, 322, 21};
        //sortAscending(array);
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int[] sortAscending(int[] array) {
        boolean swapped = false;
        int buf;
        while (!swapped) {
            swapped = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapped = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    public static int[] sortDescending(int[] array) {
        boolean swapped = false;
        int buf;
        while (!swapped) {
            swapped = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    swapped = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
}
