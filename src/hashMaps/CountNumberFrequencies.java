package hashMaps;

import java.util.HashMap;

public class CountNumberFrequencies {


    public HashMap<Integer, Integer> countNumberFrequencies(
            int[] numbers) {
HashMap<Integer,Integer> countedNumbers = new HashMap<>();
for(int i=0;i<numbers.length;i++) {
    if(countedNumbers.containsKey(numbers[i])) {
        int currentNum = countedNumbers.get(numbers[i]);
        countedNumbers.put(numbers[i],currentNum+=1);

    } else {
        countedNumbers.put(numbers[i],1);
    }
}
return countedNumbers;
    }


    public static void main(String[] args) {
        CountNumberFrequencies obj = new CountNumberFrequencies();

        int[] numbers = {2, 5, 2, 7, 5, 2};

        System.out.println(obj.countNumberFrequencies(numbers));
    }
}
