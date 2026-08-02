package strings;

public class CountCharacterOccurrences {
    public int countCharacterOccurrences(String text, char target) {
int count = 0;
        for(int i=0;i<text.length();i++) {
    if(text.charAt(i)==target) count++;
}
        return count;
    }

    public static void main(String[] args) {
        CountCharacterOccurrences obj = new CountCharacterOccurrences();
        System.out.println(obj.countCharacterOccurrences("kalema", 'a'));
    }
}
