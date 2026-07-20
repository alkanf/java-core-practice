package While;

public class CountEvenNumbers {
    public int countEvenNumbersWhile(int n) {
        int i = 0;
        int result = 0;
        while(i<n) {
            i++;
            if(i%2==0) {
                result ++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        CountEvenNumbers obj = new CountEvenNumbers();
        System.out.println(obj.countEvenNumbersWhile(6));
    }
}
