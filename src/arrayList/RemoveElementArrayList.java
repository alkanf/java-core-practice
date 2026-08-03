package arrayList;

import java.util.ArrayList;

public class RemoveElementArrayList {
    public ArrayList<Integer> removeElement(
            ArrayList<Integer> numbers,
            int index) {

        numbers.remove(index);
        return numbers;

    }

    static void main(String[] args) {
        RemoveElementArrayList obj = new RemoveElementArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);
        System.out.println(obj.removeElement(numbers,0));
    }
}
