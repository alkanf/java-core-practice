package methods;

public class Overloading {
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println(obj.calculateArea(5));      // 25
        System.out.println(obj.calculateArea(4, 6));   // 24
    }
}
