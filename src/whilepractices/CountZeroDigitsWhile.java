package whilepractices;

public class CountZeroDigitsWhile {
    public int countZeroDigitsWhile(int number) {
    int result = 0;
    while(number!=0) {
        int lastDigit = number % 10;
        number /= 10;
        if(lastDigit == 0)
            result++;
    }
    return result;
    }

    static void main(String[] args) {
        CountZeroDigitsWhile obj = new CountZeroDigitsWhile();
        System.out.println(obj.countZeroDigitsWhile(20023100));
    }
}
