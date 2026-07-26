package While;

public class AreAllDigitsEvenWhile {
    public boolean areAllDigitsEvenWhile(int number) {
        while(number>0) {
            int lastDigit = number % 10;
            number /= 10;
            if(lastDigit % 2 != 0) return false;

        }
        return true;

    }

    public static void main(String[] args) {
        AreAllDigitsEvenWhile obj = new AreAllDigitsEvenWhile();
        System.out.println(obj.areAllDigitsEvenWhile(2222));
    }

}
