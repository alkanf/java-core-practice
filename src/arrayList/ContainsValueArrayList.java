package arrayList;

import java.util.ArrayList;

public class ContainsValueArrayList {
    public boolean containsValue(
            ArrayList<Integer> numbers,
            int target) {
        for(int i=0;i<numbers.size();i++) { //number.contains(target) is inbuilt method for ArrayList
            if(numbers.get(i) == target)
                return true;
        }
return false;
    }

    static void main(String[] args) {
        ContainsValueArrayList obj = new ContainsValueArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(4);numbers.add(3);
        System.out.println(obj.containsValue(numbers, 4));
    }
}
