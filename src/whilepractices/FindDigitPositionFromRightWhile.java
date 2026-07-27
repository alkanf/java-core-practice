package whilepractices;

public class FindDigitPositionFromRightWhile {

    public int findDigitPositionFromRightWhile(int number, int target) {
        int position = 0;
while(number>0) {
    int lastDigit = number % 10;
    number /=10;
    position++;
    if(target == lastDigit) return position;
}
        return -1;

    }

    public static void main(String[] args) {
        FindDigitPositionFromRightWhile obj = new FindDigitPositionFromRightWhile();
        System.out.println(obj.findDigitPositionFromRightWhile(532432, 0));
    }

}
