package arrays;

public class ReturnArrayLength {
    public int returnArrayLength(int[] numbers) {
return numbers.length;
    }

    static void main(String[] args) {
        ReturnArrayLength obj = new ReturnArrayLength();
        int numbers[] = {23,42,3,21,3};
        System.out.println(obj.returnArrayLength(numbers));
    }
}
