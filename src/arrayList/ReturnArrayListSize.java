package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayListSize {
    public int returnArrayListSize(ArrayList<Integer> numbers) {
return numbers.size();
    }

    public static void main(String[] args) {
        ReturnArrayListSize obj = new ReturnArrayListSize();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        System.out.println(obj.returnArrayListSize(numbers));
    }

}
