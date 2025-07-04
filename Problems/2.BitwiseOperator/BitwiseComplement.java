public class BitwiseComplement {
    public static void main(String[] args) {
        System.out.println(complement(5));
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
}
