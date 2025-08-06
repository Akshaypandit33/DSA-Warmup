import java.util.Arrays;

public class SquareOfSortedArray {

    // the main idea here is to use Two Pointer Approach
    // start to put element from the back side i.e, highest element

    static public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 0);
        int start = 0;
        int end = nums.length - 1;

        int highestSquareIndex = nums.length - 1;
        while (start <= end) {
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];
            if (startSquare > endSquare) {
                res[highestSquareIndex] = startSquare;
                start++;
            }else {
                res[highestSquareIndex] = endSquare;
                end --;
            }
            highestSquareIndex --;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
