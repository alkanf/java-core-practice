package arrays;

public class IsArraySortedAscending {
    public boolean isArraySortedAscending(int[] numbers) {

        for(int i=0;i<numbers.length-1;i++) { //-1 because we have i+1
            if(numbers[i+1] > numbers[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsArraySortedAscending obj = new IsArraySortedAscending();
        int[] numbers = {9,10,7,6,5};
        System.out.println(obj.isArraySortedAscending(numbers));
}
}
