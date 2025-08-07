import java.util.Arrays;

public class ThreeSumClosest {
    static public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for(int i = 0; i <= nums.length -3; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target -closest)) {
                    closest = sum;
                }
                if(sum > target)
                {
                    right--;
                }
                else{
                    left++;
                }


            }
        }
        return closest;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(nums, 1));
    }
}
