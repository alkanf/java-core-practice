package whilepractices;

public class CountDownWhile {

    public void countDownWhile(int n) {
    int i = n+1; //init
    while(i > 1) { // condition
        i--; // increment
        System.out.println(i);
    }
    }

    public static void main(String[] args) {
        CountDownWhile obj = new CountDownWhile();
        obj.countDownWhile(5);
    }

}
