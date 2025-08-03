import java.util.Arrays;

public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int n1xn2=0;
        for(int num:nums){
            n1xn2= n1xn2 ^ num ;
        }
        // now n1xn2 will contain only XOR of two unique elements
        int rightMostBit = 1;
        while((rightMostBit & n1xn2)==0){
            rightMostBit=rightMostBit << 1;
        }

        int num1 =0;
        int num2=0;
        for(int num:nums){

            if((num & rightMostBit) == 0)
            {
                num1 = num1 ^ num;
            }
            else {
                num2 = num2 ^ num;
            }
        }
        return new int[]{num1,num2};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
