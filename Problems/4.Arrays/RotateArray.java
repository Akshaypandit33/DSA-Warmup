import java.util.Arrays;

public class RotateArray {
    static public void rotate(int[] nums, int k) {
        // doing this extra space
        int[] res = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++){
            int index = ( i + k ) % nums.length;
            res[i] = nums[index];
        }
        System.out.println(Arrays.toString(res));
    }

    // bets optimized solution
    static public void rotateEfficient(int[] nums, int k)
    {
        // reverse the whole array
        reverse(nums, 0, nums.length - 1);

        // reverse  the first k the element
        reverse(nums, 0, k-1 );
        reverse(nums, k, nums.length - 1);
    }

    static public void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
//        rotate(nums, k);
//        reverse(nums, 0, nums.length-1);
        rotateEfficient(nums, k);

    }
}
