package variables;

public class AddOne {
    public int addOne(int number) {
        return number + 1; // no need to define "int result = number +1;"
    }


    public static void main(String[] args) {
        AddOne obj = new AddOne();
        System.out.println(obj.addOne(3));
    }
}
