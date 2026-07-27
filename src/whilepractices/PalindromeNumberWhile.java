package whilepractices;

public class PalindromeNumberWhile {
    public boolean isPalindromeWhile(int number) {
        int reversed = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10; //take last digit
            reversed = reversed * 10 + lastDigit; // add to reversed
            number /= 10; //delete last digit

        }
        return reversed == originalNumber;
    }

    public static void main(String[] args) {
        PalindromeNumberWhile obj = new PalindromeNumberWhile();
        System.out.println(obj.isPalindromeWhile(1221));
    }
}
