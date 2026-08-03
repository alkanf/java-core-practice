package arrayList;

import java.util.ArrayList;

public class UpdateElementArrayList {
    public ArrayList<Integer> updateElement(
            ArrayList<Integer> numbers,
            int index,
            int newValue) {

        numbers.set(index,newValue);
        return numbers;

    }

    static void main(String[] args) {
        UpdateElementArrayList obj = new UpdateElementArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(4);
        System.out.println(obj.updateElement(numbers, 2,3));
    }
}
