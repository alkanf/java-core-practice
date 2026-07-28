package arrays;

public class SumArray {
    public int sumArray(int[] numbers) {
int result = 0;
        for(int i=0;i<numbers.length;i++) {
            result += numbers[i];
        }
        return result;
    }

    static void main() {
        SumArray obj = new SumArray();
        int numbers[] = {4,2,32,32};
        System.out.println(obj.sumArray(numbers));
    }

}
