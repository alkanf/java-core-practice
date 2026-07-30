package arrays;

public class SumElementsAtEvenIndexes {

    public int sumElementsAtEvenIndexes(int[] numbers) {
int sum = 0;
        for(int i=0;i<numbers.length;i++) {
            if(i % 2 == 0) sum += numbers[i];
        }
        return sum;




    }

    public static void main(String[] args) {
        SumElementsAtEvenIndexes obj = new SumElementsAtEvenIndexes();
        int[] numbers = {232,4,231,5,324,4};
        System.out.println(obj.sumElementsAtEvenIndexes(numbers));
    }

}
