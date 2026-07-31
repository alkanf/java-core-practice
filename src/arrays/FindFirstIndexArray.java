package arrays;

public class FindFirstIndexArray {

    public int findFirstIndex(int[] numbers, int target) {

        for(int i = 0; i<numbers.length;i++) {
            if(target == numbers[i]) {
                return i; // index not element/value = number[i]
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        FindFirstIndexArray obj = new FindFirstIndexArray();
        int[] numbers = {4,9,22,3,9,2};
        System.out.println(obj.findFirstIndex(numbers, 9));
    }
}
