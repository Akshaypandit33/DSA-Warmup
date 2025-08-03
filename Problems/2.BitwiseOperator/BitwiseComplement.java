public class BitwiseComplement {
    public static void main(String[] args) {
        System.out.println(complement(5));
        System.out.println(approach2(5));
    }
    static public int complement(int n) {
        int num = n;
        int mask =0;
        while(num != 0)
        {
            mask = mask << 1 | 1;
            num = num >> 1;
        }
        return (~n) & mask;
    }

    static  public int approach2(int n)
    {
        if (n == 0) return 1;

        // Find bit length without creating string
        int bitLength = 32 - Integer.numberOfLeadingZeros(n);

        // Create mask
        int mask = (1 << bitLength) - 1;
        return n ^ mask;
    }
}
