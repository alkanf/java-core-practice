package whilepractices;

public class ReverseNumberWhile {
    public int reverseNumberWhile(int number) {
        int reversed = 0;
while(number>0) {
    int lastDigit = number % 10; //take last digit from num var
    reversed = reversed * 10 + lastDigit; //add digit to reversed var
    number /= 10; // delete last digit from num

}
return reversed;
    }

    public static void main(String[] args) {
        ReverseNumberWhile obj = new ReverseNumberWhile();
        System.out.println(obj.reverseNumberWhile(1234));
    }
}
