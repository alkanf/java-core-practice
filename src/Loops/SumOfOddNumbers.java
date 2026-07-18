package Loops;

public class SumOfOddNumbers {
    public int sumOfOddNumbers(int n) {
        int result = 0;
    for(int i = 1;i<=n;i++) { // start from 1 as 0 its not odd and wont be counted
        if(i%2!=0) {
            result = result + i;
        }
    }
    return result;
    }

    public static void main(String[] args) {
        SumOfOddNumbers obj = new SumOfOddNumbers();
        System.out.println(obj.sumOfOddNumbers(10));
    }
}
