public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,2,2,2};
        System.out.println(singleNumber2(arr));
    }
    public static int singleNumber2(int[] arr) {
        int res =0;

        // run the loops till last bit that is for int the last bit is 31
        for(int k=0; k < 32; k++)
        {
            int countOnes=0;

            int temp = 1 << k;

            for(int ele : arr)
            {
                if( ((ele >> k) & 1) == 1)
                {
                    countOnes++;
                }
            }
            if(countOnes % 3 == 1)
            {
                res = res | temp;
            }
        }
    return res;
    }
}
