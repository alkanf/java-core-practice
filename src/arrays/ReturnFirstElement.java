package arrays;

public class ReturnFirstElement {
    public int returnFirstElement(int[] numbers) {
        return numbers[0];
    }

    public static void main(String[] args) {
        ReturnFirstElement obj = new ReturnFirstElement();
        int[] numbers = {5,469,65,6,5};
        System.out.println(obj.returnFirstElement(numbers));
    }
}
