import java.util.Arrays;

public class MoveZeros {

    static public void moveZeroes(int[] nums) {
        int index =0;
        for(int i = 0 ; i< nums.length; i++)
        {
            if(nums[i] != 0  )
            {
                if(i != index )
                {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
