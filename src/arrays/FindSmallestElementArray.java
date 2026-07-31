    package arrays;

    public class FindSmallestElementArray {
        public int findSmallestElement(int[] numbers) {
            int smallestNumber = numbers[0];  //cant do it 9 can be 2 digit
            for (int i = 1; i < numbers.length; i++) { //starts from 1 as smallestNumber already 0. index
                if (smallestNumber > numbers[i]) smallestNumber = numbers[i];
            }
            return smallestNumber;
        }

        public static void main(String[] args) {
            FindSmallestElementArray obj = new FindSmallestElementArray();
            int[] numbers = {9, 10, 7, 6, 5};
            System.out.println(obj.findSmallestElement(numbers));
        }
    }
