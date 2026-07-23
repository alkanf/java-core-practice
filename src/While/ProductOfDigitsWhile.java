package While;

public class ProductOfDigitsWhile {
    public int productOfDigitsWhile(int number) {
    int result = 1;
    while(number > 0) {
       int lastDigit = number % 10;
       number /= 10;
       result = lastDigit * result;

    }
    return result;
    }

    static void main(String[] args) {
        ProductOfDigitsWhile obj = new ProductOfDigitsWhile();
        System.out.println(obj.productOfDigitsWhile(261));
    }
}
