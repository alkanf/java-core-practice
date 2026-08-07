package methods;

public class CalculateFinalScore {
    public int calculateFinalScore(int examScore, int bonus) {
int result = examScore + bonus;
if(result > 100) { return 100; }
return result;

    }

    public static void main(String[] args) {
        CalculateFinalScore obj = new CalculateFinalScore();

        System.out.println(obj.calculateFinalScore(75, 10)); // 85
        System.out.println(obj.calculateFinalScore(95, 10)); // 100
    }
}
