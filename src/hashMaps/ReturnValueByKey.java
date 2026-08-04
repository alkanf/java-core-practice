package hashMaps;

import java.util.HashMap;

public class ReturnValueByKey {
    public int returnValueByKey(
            HashMap<String, Integer> scores,
            String name) {
        return scores.get(name);

    }

    static void main(String[] args) {
        ReturnValueByKey obj = new ReturnValueByKey();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.returnValueByKey(scores, "Ethan"));
    }
}
