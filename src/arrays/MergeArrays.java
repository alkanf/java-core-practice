package arrays;

import java.util.Arrays;

public class MergeArrays {
    public int[] mergeArrays(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            mergedArray[i] = first[i];
        }

        for (int j = 0; j < second.length; j++) {
            mergedArray[first.length + j] = second[j]; //we need to pass first.length to write second array
        }

        return mergedArray;

    }

    public static void main(String[] args) {
        MergeArrays obj = new MergeArrays();
        int[] numbers = {9, 10, 7, 6, 5};
        int[] numbers2 = {93, 10, 7, 6, 5};
        System.out.println(Arrays.toString(obj.mergeArrays(numbers, numbers2)));
    }
}

