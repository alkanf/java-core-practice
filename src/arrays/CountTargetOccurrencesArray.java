package arrays;

public class CountTargetOccurrencesArray {
    public int countTargetOccurrences(int[] numbers, int target) {
int count =0;
        for(int i =0;i<numbers.length;i++) {
            if(target == numbers[i]) {
                count++;
            }
        }
        return count;
    }

    static void main() {
        CountTargetOccurrencesArray obj = new CountTargetOccurrencesArray();
        int numbers[] = {4,2,32,32};
        System.out.println(obj.countTargetOccurrences(numbers, 32));
    }
}
