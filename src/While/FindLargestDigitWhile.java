package While;

public class FindLargestDigitWhile {
    public int findLargestDigitWhile(int number) {
    int largestDigit = 0;
    while(number > 0) {
        int lastDigit = number % 10; // take lastDigit and assign
        number /= 10; //delete lastDigit
        if(largestDigit < lastDigit)
            largestDigit = lastDigit;


    }
    return largestDigit;
    }

    static void main(String[] args) {
        FindLargestDigitWhile obj = new FindLargestDigitWhile();
        System.out.println(obj.findLargestDigitWhile(213218));
    }
}
