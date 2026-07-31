package arrays;

public class FindLastIndexArray {

    public int findLastIndex(int[] numbers, int target) {
for(int i=numbers.length-1;i>=0;i--) {
    if(target == numbers[i])
        return i;
}
return -1;
    }

    public static void main(String[] args) {
        FindLastIndexArray obj = new FindLastIndexArray();
        int numbers[] = {5,3,4,4,3,5};
        System.out.println(obj.findLastIndex(numbers, 4));
    }
}
