package whilepractices;

public class CountDigitOccurencesWhile {
    public int countDigitOccurrencesWhile(int number, int target) {
        int count = 0;
        while(number>0) {
            int lastDigit = number % 10;
            number /= 10;
            if(lastDigit == target) {count++;}
        }
        return count;

    }

    public static void main(String[] args) {
        CountDigitOccurencesWhile obj = new CountDigitOccurencesWhile();
        System.out.println(obj.countDigitOccurrencesWhile(434751843, 4));
    }
}
