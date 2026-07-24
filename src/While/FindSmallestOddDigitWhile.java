package While;

public class FindSmallestOddDigitWhile {

    public int findSmallestOddDigitWhile(int number) {
    int smallestOdd = 10; // not 9 because we return -1 in failed scenario
    while(number > 0) {
       int lastDigit = number % 10;
       number /= 10;
       if(smallestOdd > lastDigit && lastDigit % 2 != 0) {
           smallestOdd = lastDigit;
       }
    }
    if(smallestOdd == 10) { // it will stay 10 if there is no odd, because odd digit != 10
        return -1;
    } return smallestOdd;

    }

    public static void main(String[] args) {
        FindSmallestOddDigitWhile obj = new FindSmallestOddDigitWhile();
        System.out.println(obj.findSmallestOddDigitWhile(6));
    }
}
