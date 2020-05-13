package lesson8.Aritmetic;

import java.util.Arrays;

public class Arithmetic {

    public boolean check(int[] array) {
        Arrays.sort(array);
        int sum = array[0] + array[array.length - 1];
        if (sum > 100)
            return true;
        else
            return false;

    }

}
