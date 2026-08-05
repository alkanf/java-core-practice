package hashMaps;

import java.util.HashMap;

public class CountWordFrequencies {
    public HashMap<String, Integer> countWordFrequencies(
            String[] words) {
        HashMap<String,Integer> countedWords = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            String = words[i];
            if (countedWords.containsKey(words[i])) {
                int currentCount = countedWords.get(word);

                word = currentCount + 1;
            } else {
                word = 1;
            }
        }

    }

    public static void main(String[] args) {
        CountWordFrequencies obj = new CountWordFrequencies();

        String[] words = {
                "java", "api", "java",
                "test", "api", "java"
        };

        System.out.println(obj.countWordFrequencies(words));
    }

}
