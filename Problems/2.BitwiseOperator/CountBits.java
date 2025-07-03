import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int num =i;
            int count =0;
            while(num !=0)
            {
                count = count +( num & 1);
                arr[i] = count;
                num= num>>1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }
}
