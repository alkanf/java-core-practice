package hashMaps;

import java.util.HashMap;

public class ReturnHashMapSize {
    public int returnHashMapSize(
            HashMap<String, Integer> scores) {
        return scores.size();

    }


    static void main(String[] args) {
        ReturnHashMapSize obj = new ReturnHashMapSize();
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.returnHashMapSize(scores));
    }
}
