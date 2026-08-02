package strings;

public class LongestCharacterStreak {


    public int longestCharacterStreak(String text) {
        int currentStreak = 1; // Şu an devam eden seri
        int maxStreak = 1;     // Şimdiye kadarki en uzun seri
        char refChar = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (refChar == text.charAt(i)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }

            refChar = text.charAt(i);

        }
        return maxStreak;
    }

    public static void main(String[] args) {
        LongestCharacterStreak obj = new LongestCharacterStreak();
        System.out.println(obj.longestCharacterStreak("ana kelime"));
    }

    }
