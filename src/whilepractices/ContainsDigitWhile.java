package whilepractices;

public class ContainsDigitWhile {
    public boolean containsDigitWhile(int number, int target) {
while(number > 0 ) {
    int lastDigit = number % 10;
    number /= 10;
    if(lastDigit==target) {
        return true;
    }
    }
return false;
}

    public static void main(String[] args) {
        ContainsDigitWhile obj = new ContainsDigitWhile();
        System.out.println(obj.containsDigitWhile(22316345,1));
    }
}
