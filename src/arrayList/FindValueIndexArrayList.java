package arrayList;

import java.util.ArrayList;

public class FindValueIndexArrayList {
    public int findValueIndex(
            ArrayList<Integer> numbers,
            int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target)
                return i;  //return numbers.lastIndexOf(target) return numbers.indexOf(target); same result
        }
        return -1;
    }

    static void main(String[] args) {
        FindValueIndexArrayList obj = new FindValueIndexArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);
        System.out.println(obj.findValueIndex(numbers,2));
    }
    }
