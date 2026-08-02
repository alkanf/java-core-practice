package strings;

public class IsPalindromeString {
    public boolean isPalindromeString(String text) {

        String reversedText = "";
        for(int i=text.length()-1;i>=0;i--) {
            reversedText += text.charAt(i);
        }
        if(text.equals(reversedText)) return true;
        return false;

    }

    public static void main(String[] args) {
        IsPalindromeString obj = new IsPalindromeString();
        System.out.println(obj.isPalindromeString("ana"));
    }
}
