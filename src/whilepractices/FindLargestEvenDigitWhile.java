package whilepractices;

public class FindLargestEvenDigitWhile {
    public int findLargestEvenDigitWhile(int number) {
        int largestEven = -1; // return -1 if there is no even
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0 && largestEven < lastDigit) {
                largestEven = lastDigit;
            }

        }
        return largestEven;
    }

    public static void main(String[] args) {
        FindLargestEvenDigitWhile obj = new FindLargestEvenDigitWhile();
        System.out.println(obj.findLargestEvenDigitWhile(2341119));
    }
}
