package Loops;

public class PrintNumbers {

    public void printNumbers() {
        for(int i = 1;i<6;i++) {
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        PrintNumbers obj = new PrintNumbers();
        obj.printNumbers();
    }
}
