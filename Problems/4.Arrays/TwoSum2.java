import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        // taking two pointers i,j
        int i=0, j=numbers.length-1;
        while(i<j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum == target)
            {
                return new int[]{i+1,j+1};
            }
            else if(sum > target)
            {
                j = j-1;
            }
            else {
                i =i +1;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
