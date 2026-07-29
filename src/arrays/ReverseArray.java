package arrays;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] numbers) {
        int j = 0;
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[j] = numbers[i];
            j++;
        }        return reversed;

    }

    public static void main(String[] args) {

        ReverseArray obj = new ReverseArray();
        int[] numbers = {4,9,22,3,9,2};
        System.out.println(Arrays.toString(obj.reverseArray(numbers)));
    }
}
