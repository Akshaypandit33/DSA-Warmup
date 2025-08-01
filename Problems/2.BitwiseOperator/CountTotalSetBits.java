public class CountTotalSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(1000000000));
    }
    public static int countSetBits(int num) {
        int count =0;
        for(int i =1; i <= num; i++)
        {
            System.out.println("count "+countBits(i));
            count = count+ countBits(i);
        }
        return count % 100_000_007;
    }

    public static int countBits(int num) {
        int count=0;
        while (num !=0 )
        {
            if( (num&1) == 1 )
            {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
