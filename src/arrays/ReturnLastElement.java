package arrays;

public class ReturnLastElement {
    public int returnLastElement(int[] numbers) {
       return numbers[numbers.length-1];

    }

    public static void main(String[] args) {
        ReturnLastElement obj = new ReturnLastElement();
        int numbers[] = {5,4,3,51,3};
        System.out.println(obj.returnLastElement(numbers));
    }
}
