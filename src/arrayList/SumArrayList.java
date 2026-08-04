package arrayList;

import java.util.ArrayList;

public class SumArrayList {
    public int sumArrayList(ArrayList<Integer> numbers) {
        int result = 0;
for(int i=0;i<numbers.size();i++) {
    result += numbers.get(i);
}
return result;
    }

    static void main(String[] args) {
        SumArrayList obj = new SumArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(3);
        System.out.println(obj.sumArrayList(numbers));
    }
}
