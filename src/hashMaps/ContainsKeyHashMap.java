package hashMaps;

import java.util.HashMap;

public class ContainsKeyHashMap {
    public boolean containsKey(
            HashMap<String, Integer> scores,
            String name) {
        return scores.containsKey(name);

    }

    static void main(String[] args) {
        ContainsKeyHashMap obj = new ContainsKeyHashMap();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.containsKey(scores, "Ethan"));
    }

}
