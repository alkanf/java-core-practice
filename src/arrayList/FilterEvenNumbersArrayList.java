package arrayList;

import java.util.ArrayList;
import java.util.logging.Filter;

public class FilterEvenNumbersArrayList {
    public ArrayList<Integer> filterEvenNumbers(
            ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i=0;i<numbers.size();i++) {
            if(numbers.get(i) % 2 == 0) {
                int evenNumber = numbers.get(i);
                evenNumbers.add(evenNumber); }
        }
        return evenNumbers;
    }

    static void main(String[] args) {
        FilterEvenNumbersArrayList obj = new FilterEvenNumbersArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(6);
        System.out.println(obj.filterEvenNumbers(numbers));
    }
}
