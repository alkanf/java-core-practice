package hashMaps;

import java.util.HashMap;

public class AddOrUpdateScoreHashMap {
    public HashMap<String, Integer> addOrUpdateScore(
            HashMap<String, Integer> scores,
            String name,
            int score) {

        scores.put(name, score);
        return scores;

    }

    static void main(String[] args) {
        AddOrUpdateScoreHashMap obj = new AddOrUpdateScoreHashMap();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.addOrUpdateScore(scores,"Ethan", 46));
    }
}
