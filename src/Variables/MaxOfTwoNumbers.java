package Variables;

public class MaxOfTwoNumbers {


    public int max(int a, int b) {
    if(a>=b) {
        return a;
    } else return b;

    }

    public static void main(String[] args) {
        MaxOfTwoNumbers obj = new MaxOfTwoNumbers();
        System.out.println(obj.max(1,4));
        System.out.println(obj.max(2,5));
        System.out.println(obj.max(4,4));


    }

}
