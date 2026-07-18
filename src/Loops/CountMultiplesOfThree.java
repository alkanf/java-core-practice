package Loops;

public class CountMultiplesOfThree {
    public int countMultiplesOfThree(int n) {
        int count = 0;
        for(int i=1;i<=n;i++) {
            if(i%3==0) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        CountMultiplesOfThree obj = new CountMultiplesOfThree();
        System.out.println(obj.countMultiplesOfThree(6));
    }
}
