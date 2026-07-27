package whilepractices;

public class FindFirstDigitWhile {

    public int findFirstDigitWhile(int number) {

        while(number>9) {
              number /=10;

        }
        return number;
    }

    public static void main(String[] args) {
        FindFirstDigitWhile obj = new FindFirstDigitWhile();
        System.out.println(obj.findFirstDigitWhile(7));
    }

}
