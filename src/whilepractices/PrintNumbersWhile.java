package whilepractices;

public class PrintNumbersWhile {
    public void printNumbersWhile(int n) {
    int i = 0; //init
                while(i<n){  //condition
                    i++;
                    System.out.println(i);
                }
    }

    public static void main(String[] args) {
        PrintNumbersWhile obj = new PrintNumbersWhile();
        obj.printNumbersWhile(5);
    }

}
