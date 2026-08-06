package hashMaps;

import java.util.HashMap;

public class FindMostFrequentNumber {

    public int findMostFrequentNumber(int[] numbers) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(!hash.containsKey(number)) {
                hash.put(number,1);
            }
            else hash.put(number,number+1);
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        FindMostFrequentNumber obj = new FindMostFrequentNumber();

        int[] numbers = {2, 5, 2, 7, 5, 2};

        System.out.println(obj.findMostFrequentNumber(numbers));
    }
}
