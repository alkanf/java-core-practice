package loops;

public class ReverseCount {
    public void reverseCount(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i); //Its void so doenst have return
        }

    }

    public static void main(String[] args) {
        ReverseCount obj = new ReverseCount();
        obj.reverseCount(5);
    }
}
