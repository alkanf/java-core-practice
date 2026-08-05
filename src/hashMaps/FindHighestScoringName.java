package hashMaps;

import java.util.HashMap;
import java.util.Map;
public class FindHighestScoringName {
public String findHighestScoringName(
        HashMap<String, Integer> scores) {

    int maxScore = 0;
    String highestScoringName = "";

    for (Map.Entry<String, Integer> entry : scores.entrySet()) {
        String name = entry.getKey();
        int score = entry.getValue();

       if(score>maxScore) {
       maxScore = score; highestScoringName = name;}    }

    return highestScoringName;
}

    static void main(String[] args) {
        FindHighestScoringName obj = new FindHighestScoringName();
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Ethan", 45);
        scores.put("Melissa", 47);
        scores.put("Dan", 67);
        System.out.println(obj.findHighestScoringName(scores));
    }
}
