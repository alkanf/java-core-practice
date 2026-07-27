package loops;

public class SumOfMultiplesOfFive {

    public int sumOfMultiplesOfFive(int n) {
       int result = 0;
for(int i=0;i<=n;i++) {
    if(i % 5 == 0) {
        result += i;
    }
}
return result;
    }

    public static void main(String[] args) {
        SumOfMultiplesOfFive obj = new SumOfMultiplesOfFive();
        System.out.println(obj.sumOfMultiplesOfFive(10));
    }
}
