package strings;

public class ReturnCharacterAtIndex {
    public char returnCharacterAtIndex(String text, int index) {
return text.charAt(index);
    }

    public static void main(String[] args) {
        ReturnCharacterAtIndex obj = new ReturnCharacterAtIndex();
        System.out.println(obj.returnCharacterAtIndex("kalem",4));
    }
}
