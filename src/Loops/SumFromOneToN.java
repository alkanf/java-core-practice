package Loops;

public class SumFromOneToN {

    public int sumFromOneToN(int n) {
        int result = 0;
    for(int i=1;i<=n;i++) {
        result = result + i;
    }
    return result;
    }

    public static void main(String[] args) {
        SumFromOneToN obj = new SumFromOneToN();
        System.out.println(obj.sumFromOneToN(3));
    }
}
