package arrayList;

import java.util.ArrayList;

public class AddElementArrayList {
    public ArrayList<Integer> addElement(
            ArrayList<Integer> numbers,
            int value) {
        numbers.add(value);
        return numbers;

    }

    static void main(String[] args) {
        AddElementArrayList obj = new AddElementArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);
        System.out.println(obj.addElement(numbers,4));
    }
}
