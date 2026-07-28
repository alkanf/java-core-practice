package arrays;

public class ReturnElementAtIndex {
    public int returnElementAtIndex(int[] numbers, int index) {
        return numbers[index];
    }

    static void main(String[] args) {
        ReturnElementAtIndex obj = new ReturnElementAtIndex();
        int[] numbers = {4,5,21,3,2};
        System.out.println(obj.returnElementAtIndex(numbers,2));
    }
}
