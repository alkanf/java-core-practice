package variables;

public class ReturnNumber {


    public int returnNumber (int number) {
        return number;
    }

    public static void main(String[] args) {
        ReturnNumber obj = new ReturnNumber();
        System.out.println(obj.returnNumber(2));
    }
}
