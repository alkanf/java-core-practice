package Variables;

public class AbsoluteValue {

    public int absoluteValue(int number) {
        if (number > 0) {
            return number;
        } else if (number < 0) {
            return number * -1;
        } else return 0;
    }

    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        System.out.println(obj.absoluteValue(2));
        System.out.println(obj.absoluteValue(0));
        System.out.println(obj.absoluteValue(-2));
    }

}

