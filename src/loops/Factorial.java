package loops;

public class Factorial {

    public int factorial(int n) {
        int result = 1; // as we cannot multiply with zero
    for(int i=1;i<=n;i++) {
        result = result * i;
    }
    return result;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.factorial(3));
    }
}
