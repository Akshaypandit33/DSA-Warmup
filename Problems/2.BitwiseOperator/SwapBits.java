/*
swap the bits at position i and j in the binary representation of the number x
 */


public class SwapBits {
    public static void main(String[] args) {
        System.out.println("Result : "+Integer.toBinaryString(swapBits(73,1,6)));
    }
    public static int swapBits(int x, int i, int j) {

        System.out.println("Binary of x is : "+Integer.toBinaryString(x));
        // extract the bits value at i-th position and j-th bit and check whether they are same or not
        if( ((x >>> i) & 1) != ((x >>> j) & 1))
        {
            // we will using bitmasks to flip the bit using XOR at the i and j position
            int mask = (1 << i) | (1 << j);
            System.out.println("mask is : "+Integer.toBinaryString(mask));
            // performing XOR

            x = x^ mask;
        }
        return x;
    }
}
