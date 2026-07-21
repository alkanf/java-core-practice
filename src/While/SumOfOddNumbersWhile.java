package While;

public class SumOfOddNumbersWhile {
    public int sumOfOddNumbersWhile(int n) {
int i = 0;
int result = 0;
while(i<n) {
    i++;
    if(i%2!=0) {
        result += i;
    }
}
return result;
    }

    public static void main(String[] args) {
        System.out.println();
        SumOfOddNumbersWhile obj = new SumOfOddNumbersWhile();
        System.out.println(obj.sumOfOddNumbersWhile(5));
    }


}
