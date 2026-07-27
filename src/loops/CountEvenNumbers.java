package loops;

public class CountEvenNumbers {
    public int countEvenNumbers(int n) {
        int count = 0;
    for(int i=1;i<=n;i++) { //dont count 0 as even
        if(i%2==0) {
            count++;
        }
    }
    return count;
    }

    public static void main(String[] args) {
        CountEvenNumbers obj = new CountEvenNumbers();
        System.out.println(obj.countEvenNumbers(10));
    }

}
