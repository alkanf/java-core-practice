package strings;

public class CountVowels {
    public int countVowels(String text) {
int count = 0;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
                count++; //    char currentCharacter = text.charAt(i); can shorten the code

        }
        return count;
    }

    public static void main(String[] args) {
        CountVowels obj = new CountVowels();
        System.out.println(obj.countVowels("ana"));
    }

}
