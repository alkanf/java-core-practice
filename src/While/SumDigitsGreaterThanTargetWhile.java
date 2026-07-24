package While;

public class SumDigitsGreaterThanTargetWhile {

    public int sumDigitsGreaterThanTargetWhile(int number, int target) {
        int result = 0;
        while(number>0) {
            int lastDigit = number % 10;
            number /= 10;
            if(lastDigit > target) {
                result += lastDigit;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        SumDigitsGreaterThanTargetWhile obj = new SumDigitsGreaterThanTargetWhile();
        System.out.println(obj.sumDigitsGreaterThanTargetWhile(612234778,7));
    }
}
