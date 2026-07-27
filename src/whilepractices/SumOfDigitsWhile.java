package whilepractices;

public class SumOfDigitsWhile {
    public int sumOfDigitsWhile(int number) {
    int sum = 0;
    while(number > 0) {
        int digit = number % 10; // take the last number
        sum += digit; // add it
        number /= 10; // delete the last number
    }
    return sum;
    }

    public static void main(String[] args) {
        SumOfDigitsWhile obj = new SumOfDigitsWhile();
        System.out.println(obj.sumOfDigitsWhile(325));
    }
}
