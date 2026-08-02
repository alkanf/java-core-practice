package strings;

public class ReverseString {

    public String reverseString(String text) {
        String reversedText = "";

        for(int i=text.length()-1;i>=0;i--) {
            reversedText = reversedText + text.charAt(i);


        }
return reversedText;
    }



    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverseString("kalem"));
    }
}
