package While;

public class CountDigitsWhile {
    public int countDigitsWhile(int number) {
        int countDigits = 0;
        while (number != 0) { // Includes both negative and positive cases, number<0 wont work as number will return positive after the first increment
            number *= -1; // For negative cases
            number /= 10;
            countDigits++;
        }
        return countDigits;
    }


    public static void main(String[] args) {
        CountDigitsWhile obj = new CountDigitsWhile();
        System.out.println(obj.countDigitsWhile(-500));
        System.out.println(obj.countDigitsWhile(500));
    }
}
