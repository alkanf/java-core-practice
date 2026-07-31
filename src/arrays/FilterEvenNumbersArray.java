package arrays;

import java.util.Arrays;

public class FilterEvenNumbersArray {

    public int[] filterEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) evenCount++;
        }
        int[] evenNumbers = new int[evenCount]; //Not numbers.lenght but eventCount
        int j = 0; //blank number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[j] = numbers[i];
                j++;
            }
        }
        return evenNumbers;
    }


    static void main() {
        FilterEvenNumbersArray obj = new FilterEvenNumbersArray();
        int numbers[] = {4, 1, 32, 32};
        System.out.println(Arrays.toString(obj.filterEvenNumbers(numbers))); //return type is array
    }
}
