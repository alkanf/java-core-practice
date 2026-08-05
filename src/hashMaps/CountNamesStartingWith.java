package hashMaps;

import java.util.HashMap;

public class CountNamesStartingWith {
    public int countNamesStartingWith(
            HashMap<String, Integer> scores,
            char target) {
int count = 0;
        for(String name : scores.keySet()) {
if(name.charAt(0) == target)
    count++;
        }
return count;
    }

    static void main(String[] args) {
        CountNamesStartingWith obj = new CountNamesStartingWith();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 85);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.countNamesStartingWith(scores, 'E'));
    }
}
