import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // O(n log n)

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate a
            twoSum(nums, i + 1, -nums[i], nums[i], result);
        }
        return result;
    }

    public static void twoSum(int[] nums, int start, int target, int first, List<List<Integer>> result) {
        int left = start, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result.add(List.of(first, nums[left], nums[right]));

                // Skip duplicates for left
                while (left < right && nums[left] == nums[left + 1]) left++;
                // Skip duplicates for right
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}
