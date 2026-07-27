package whilepractices;

public class SumFromOneToNWhile {

    public int sumFromOneToNWhile(int n) {
    int i = 0;
    int result = 0;
    while(i<n) {
        i++;
        result +=i;
    }
        return result;

    }

    public static void main(String[] args) {
        SumFromOneToNWhile obj = new SumFromOneToNWhile();
        System.out.println(obj.sumFromOneToNWhile(5));
    }
}
