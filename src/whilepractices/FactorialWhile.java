package whilepractices;

public class FactorialWhile {

    public int factorialWhile(int n) {
        int i = 1;
        int result = 1;
        while (i < n) {
            i++;
            result *= i;

        }
        return result;
    }

    public static void main(String[] args) {
        FactorialWhile obj = new FactorialWhile();
        System.out.println(obj.factorialWhile(5));
    }

}
