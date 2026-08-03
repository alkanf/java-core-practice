package arrayList;

import java.util.ArrayList;

public class ReturnFirstElementArrayList {
    public int returnFirstElement(ArrayList<Integer> numbers) {
return numbers.get(0);
    }

    static void main() {
        ReturnFirstElementArrayList obj = new ReturnFirstElementArrayList();
        ArrayList<Integer> numbers = new ArrayList<>(); //No fixed size
        numbers.add(1); numbers.add(1);
        System.out.println(obj.returnFirstElement(numbers));


    }
}
