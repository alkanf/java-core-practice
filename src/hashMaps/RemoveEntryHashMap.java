package hashMaps;

import java.util.HashMap;

public class RemoveEntryHashMap {

    public HashMap<String, Integer> removeEntry(
            HashMap<String, Integer> scores,
            String name) {
        scores.remove(name);
        return scores;

    }

    static void main(String[] args) {
        RemoveEntryHashMap obj = new RemoveEntryHashMap();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.removeEntry(scores, "Ethan"));

    }
}
