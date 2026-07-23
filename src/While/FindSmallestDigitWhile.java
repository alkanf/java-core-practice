package While;

public class FindSmallestDigitWhile {
    public int findSmallestDigitWhile(int number) {
int smallestDigit = 9; //must start from 9 otherwise 0 will be return always
while (number > 0) {
    int lastDigit = number % 10 ; // take lastDigit
    number /= 10; // delete last digit
    if(smallestDigit > lastDigit) {
        smallestDigit = lastDigit;
    }
}return smallestDigit;

    }

    static void main(String[] args) {
        FindSmallestDigitWhile obj = new FindSmallestDigitWhile();
        System.out.println(obj.findSmallestDigitWhile(2456489));
    }
}
