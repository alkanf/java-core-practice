package hashMaps;

import java.util.HashMap;

public class SumHashMapValues {
    public int sumHashMapValues(
            HashMap<String, Integer> scores) {
        int result = 0;
        for(Integer score : scores.values()) {
            result += score; }

        return result;

    }


    static void main(String[] args) {
        SumHashMapValues obj = new SumHashMapValues();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.sumHashMapValues(scores));
    }

}