package hashMaps;

import java.util.HashMap;

public class CountScoresGreaterThanTarget {

    public int countScoresGreaterThanTarget(
            HashMap<String, Integer> scores,
            int target) {
        int count = 0;
        for (Integer score : scores.values()) {
            if (target < score) count++;
        }
        return count;
    }


    static void main(String[] args) {
        CountScoresGreaterThanTarget obj = new CountScoresGreaterThanTarget();
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.countScoresGreaterThanTarget(scores, 60));
    }
}
