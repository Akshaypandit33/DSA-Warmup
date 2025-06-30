public class NumberOf1sBit {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int result=0;
        while(n != 0)
        {
            int lsb = n&1;
            if(lsb == 1)
            {
                result += 1;
            }
            n = n >> 1;
        }
        return result;
    }
}
