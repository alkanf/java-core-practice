package arrays;

public class CountEvenNumbersArray {
    public int countEvenNumbers(int[] numbers) {
        int count = 0;
for(int i = 0; i<numbers.length;i++) {
    if(numbers[i] % 2 == 0) count++;
}
return count;
    }

    static void main(String[] args) {
        CountEvenNumbersArray obj = new CountEvenNumbersArray();
        int numbers [] = {2,3,42,313,2};
        System.out.println(obj.countEvenNumbers(numbers));
    }
}
