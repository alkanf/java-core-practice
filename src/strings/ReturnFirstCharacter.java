package strings;

public class ReturnFirstCharacter {
    public char returnFirstCharacter(String text) {
return text.charAt(0);
    }

    public char returnLastCharacter(String text) {
        return text.charAt(text.length()-1);

    }


    public static void main(String[] args) {
        ReturnFirstCharacter obj = new ReturnFirstCharacter();
        System.out.println(obj.returnFirstCharacter("Deli"));

        System.out.println(obj.returnLastCharacter("Deli"));
    }
}
