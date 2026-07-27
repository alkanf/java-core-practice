package whilepractices;

public class CountAdjacentEqualDigitsWhile {
    public int countAdjacentEqualDigitsWhile(int number) {
        int refNumber = number % 10;
        number /= 10;
        int count = 0;
        while (number > 0) {
            int nextNumber = number % 10;
            number /= 10;

            if (refNumber == nextNumber) {
                count++;
            }
            refNumber = nextNumber;


        }
        return count;
    }

    public static void main(String[] args) {
        CountAdjacentEqualDigitsWhile obj = new CountAdjacentEqualDigitsWhile();
        System.out.println(obj.countAdjacentEqualDigitsWhile(2222));
    }
}

