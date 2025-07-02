public class BasicBitOperations {
    public static void main(String[] args) {
        System.out.println(getBit(10,3));
        System.out.println(setBit(10,2));
    }

    // get the i th index bit
    public static boolean getBit(int  num, int i)
    {

        return(num &(1 << i)) !=0;
    }

    // set the bit value to 1 regardless of the bit value
    public static int setBit(int  num, int i)
    {
        return num | (1 <<i);
    }


}
