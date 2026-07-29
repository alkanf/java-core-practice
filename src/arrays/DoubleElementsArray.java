package arrays;

import java.util.Arrays;

public class DoubleElementsArray {
    public int[] doubleElements(int[] numbers) {
    int[] doubleArray = new int[numbers.length];
        for(int i=0;i<numbers.length;i++) {
            doubleArray[i] = numbers[i] *2;
        }
        return doubleArray;
    }


    public static void main(String[] args) {

        DoubleElementsArray obj = new DoubleElementsArray();
        int[] numbers = {4,9,22,3,9,2};
        System.out.println(Arrays.toString(obj.doubleElements(numbers)));
    }
}

