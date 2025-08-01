import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // base case
        if(nums.length == 2)
        {
            return new int[]{0,1};
        }
        for(int i = 0; i < nums.length - 1 ; i++)
        {
            {
                int look = target - nums[i];

                for(int j = i+1; j < nums.length ; j++)
                {
                    if(nums[j] == look)
                    {
                        return new int[]{i,j};
                    }

                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] optimisedSolution(int[] nums, int target) {
        if(nums.length == 2)
        {
            return new int[]{0,1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++)
        {
            int targetElement = target - nums[i];
            if(map.containsKey(targetElement))
            {
                return new int[]{i,map.get(targetElement)};
            }
            else {
                map.put(nums[i],i);
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
       int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
//        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(optimisedSolution(nums,target)));
    }

}
