package arrayList;

import java.util.ArrayList;

public class ReturnLastElementArrayList {

    public int returnLastElement(ArrayList<Integer> numbers) {
return numbers.get(numbers.size()-1);
    }

    static void main(String[] args) {
        ReturnLastElementArrayList obj = new ReturnLastElementArrayList();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(4);
        System.out.println(obj.returnLastElement(numbers));
    }
}
