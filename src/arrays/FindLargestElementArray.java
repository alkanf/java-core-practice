package arrays;

import org.w3c.dom.ls.LSOutput;

public class FindLargestElementArray {
    public int findLargestElement(int[] numbers) {
        int maxNumber = numbers[0]; // using index will be applicable for negatives also
        for(int i=0;i<numbers.length;i++) {
    if (maxNumber<numbers[i])
        maxNumber = numbers[i];
}
return maxNumber;
    }

    static void main(String[] args) {
        FindLargestElementArray obj = new FindLargestElementArray();
int numbers[] = {3,4,2,31};
        System.out.println(obj.findLargestElement(numbers));
    }

}
