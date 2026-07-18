package Loops;

public class ContainsNumber {
    public boolean containsNumber(int n, int target) {
    for(int i=0;i<=n;i++) {
        if(i == target) {
            return true;
        }
    }
    return false;
    }

    public static void main(String[] args) {
        ContainsNumber obj = new ContainsNumber();
        System.out.println(obj.containsNumber(10,4));
    }
}
